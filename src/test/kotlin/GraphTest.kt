package no.nav.rapidsandriversgraph

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class GraphTest {

    @AfterEach
    fun afterEach() {
        Node.clear()
    }

    fun lagTestGraph(events: List<String> = events()): Graph {
        val graph = Graph()

        events.map {
            ConsumerRecord("test", 0, 0, "", it).tilEvent()
        }.forEach(graph::lesInnEvent)
        return graph
    }

    @Test
    fun byggGraph() {

        assertEquals(
            """
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat --> toi-synlighetsmotor;
            ```
        """.trimIndent(),
            lagTestGraph().tilMermaidGraph()
        )
    }

    @Test
    fun byggGraphForEventUtenEdges() {
        assertEquals(
            """
            <details><summary>kandidat.cv-delt-med-arbeidsgiver-via-rekrutteringsbistand</summary>
            
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat --> toi-synlighetsmotor;
            
            
            ```
            
            </details>
        """.trimIndent(),
            lagTestGraph()
                .tilMermaidGraphPerEvent()["kandidat.cv-delt-med-arbeidsgiver-via-rekrutteringsbistand"]
        )
    }

    @Test
    fun byggGraphPerPerEvent() {
        val mermaidGraphPerEvent = lagTestGraph().tilMermaidGraphPerEvent()

        assertEquals(
            """
            <details><summary>oppfølgingsinformasjon</summary>
            
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon:::x --> toi-identmapper:::x;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat --> toi-synlighetsmotor;
            
            linkStyle 2 stroke:red;
            classDef x stroke: red;
            ```
            
            </details>
        """.trimIndent(), mermaidGraphPerEvent["oppfølgingsinformasjon"]
        )
        assertEquals(
            """
            <details><summary>arbeidsmarked-cv.sammenstilt</summary>
            
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv:::x --> toi-sammenstille-kandidat:::x;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
            
            linkStyle 0,4 stroke:red;
            classDef x stroke: red;
            ```
            
            </details>
        """.trimIndent(), mermaidGraphPerEvent["arbeidsmarked-cv.sammenstilt"],
        )
        assertEquals(
            """
            <details><summary>oppfølgingsperiode.sammenstilt</summary>
            
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            toi-oppfolgingsperiode:::x --> toi-sammenstille-kandidat:::x;
            toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
            
            linkStyle 3,4 stroke:red;
            classDef x stroke: red;
            ```
            
            </details>
        """.trimIndent(), mermaidGraphPerEvent["oppfølgingsperiode.sammenstilt"]
        )
        assertEquals(
            """
            <details><summary>oppfølgingsinformasjon.sammenstilt</summary>
          
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper:::x --> toi-sammenstille-kandidat:::x;
            toi-oppfolgingsinformasjon:::x --> toi-identmapper:::x;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
            
            linkStyle 1,2,4 stroke:red;
            classDef x stroke: red;
            ```
            
            </details>
        """.trimIndent(), mermaidGraphPerEvent["oppfølgingsinformasjon.sammenstilt"]
        )
    }

    @Test
    fun ignorererInvalidEvents() {
        assertEquals(
            """
            ```mermaid
            graph TD;
            
            ```
        """.trimIndent(), lagTestGraph(listOf(invalidJsonEvent)).tilMermaidGraph()
        )
        assertEquals(
            """
            ```mermaid
            graph TD;
            
            ```
        """.trimIndent(),
            lagTestGraph(listOf(invalidSystemParticipatingServicesEvent)).tilMermaidGraph()
        )
    }
    @Test
    fun ignorererEventerSomSkalSkippes() {
        assertEquals(
            """
            ```mermaid
            graph TD;
            
            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("application_up"))).tilMermaidGraph()
        )
        assertEquals(
            """
            ```mermaid
            graph TD;

            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("application_down"))).tilMermaidGraph()
        )
        assertEquals(
            """
            ```mermaid
            graph TD;

            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("application_not_ready"))).tilMermaidGraph()
        )
        assertEquals(
            """
            ```mermaid
            graph TD;

            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("application_ready"))).tilMermaidGraph()
        )
        assertEquals(
            """
            ```mermaid
            graph TD;

            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("application_stop"))).tilMermaidGraph()
        )
    }

    @Test
    fun brukEventerSomIkkeSkalSkippes() {
        assertEquals(
            """
            ```mermaid
            graph TD;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            ```
        """.trimIndent(), lagTestGraph(listOf(dummyEvent("ikke_skip"))).tilMermaidGraph()
        )
    }
}

fun events() = listOf(
    """
        {
          "@event_name": "kandidat.cv-delt-med-arbeidsgiver-via-rekrutteringsbistand",
          "kandidathendelse": {
            "type": "CV_DELT_VIA_REKRUTTERINGSBISTAND",
            "aktørId": "2920221987929",
            "organisasjonsnummer": "312113341",
            "kandidatlisteId": "d5b5b4c1-0375-4719-9038-ab31fe27fb40",
            "tidspunkt": "2022-12-01T15:18:07.71+01:00",
            "stillingsId": "b5919e46-9882-4b3c-8089-53ad02f26023",
            "utførtAvNavIdent": "Z994122",
            "utførtAvNavKontorKode": "1860",
            "synligKandidat": true,
            "harHullICv": true,
            "alder": 53,
            "tilretteleggingsbehov": []
          }
        }
    """.trimIndent(),
    """
        {
          "@event_name": "kandidat.cv-delt-med-arbeidsgiver-via-rekrutteringsbistand",
          "kandidathendelse": {
            "type": "CV_DELT_VIA_REKRUTTERINGSBISTAND",
            "aktørId": "2920221987929",
            "organisasjonsnummer": "312113341",
            "kandidatlisteId": "d5b5b4c1-0375-4719-9038-ab31fe27fb40",
            "tidspunkt": "2022-12-01T15:18:07.71+01:00",
            "stillingsId": "b5919e46-9882-4b3c-8089-53ad02f26023",
            "utførtAvNavIdent": "Z994122",
            "utførtAvNavKontorKode": "1860",
            "synligKandidat": true,
            "harHullICv": true,
            "alder": 53,
            "tilretteleggingsbehov": []
          },
          "@id": "b087deec-bf85-46d2-bcdf-bc549070b3f0",
          "@opprettet": "2022-12-01T15:19:01.800918455",
          "system_read_count": 0,
          "system_participating_services": [
            {
              "id": "6e239cfd-30d3-4f49-828e-56cc272d1c55",
              "time": "2022-12-01T15:19:01.125622865",
              "service": "rekrutteringsbistand-stilling-api",
              "instance": "rekrutteringsbistand-stilling-api-7dbd5dfb77-hm92k",
              "image": "ghcr.io/navikt/rekrutteringsbistand-stilling-api/rekrutteringsbistand-stilling-api:06a23f7330b27cfb7cc972e8294b7a11a616c5c6"
            }
          ],
          "stillingsinfo": {
            "stillingsinfoid": "d55c3510-d263-42da-8785-3c92d3eb8732",
            "stillingsid": "b5919e46-9882-4b3c-8089-53ad02f26023",
            "eier": null,
            "notat": null,
            "stillingskategori": "STILLING"
          },
          "stilling": {
            "stillingstittel": "En fantastisk stilling"
          },
          "@forårsaket_av": {
            "id": "6e239cfd-30d3-4f49-828e-56cc272d1c55",
            "opprettet": "2022-12-01T15:19:01.125622865",
            "event_name": "kandidat.cv-delt-med-arbeidsgiver-via-rekrutteringsbistand"
          }
        }
    """.trimIndent(),
    """
        {
          "fodselsnummer": "24810298428",
          "oppfølgingsinformasjon": {
            "fodselsnummer": "24810298428",
            "formidlingsgruppe": "IARBS",
            "iservFraDato": null,
            "fornavn": "VOKAL",
            "etternavn": "PLASS",
            "oppfolgingsenhet": "1557",
            "kvalifiseringsgruppe": "VURDI",
            "rettighetsgruppe": "IYT",
            "hovedmaal": null,
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-29T11:35:14+01:00"
          },
          "@event_name": "oppfølgingsinformasjon",
          "@id": "82bfaaa5-4222-4718-9249-f3fa947aa7c0",
          "@opprettet": "2022-12-29T11:36:02.738558198",
          "system_read_count": 1,
          "system_participating_services": [
            {
              "id": "82bfaaa5-4222-4718-9249-f3fa947aa7c0",
              "time": "2022-12-29T11:36:02.738558198",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "82bfaaa5-4222-4718-9249-f3fa947aa7c0",
              "time": "2022-12-29T11:36:02.746593492",
              "service": "toi-identmapper",
              "instance": "toi-identmapper-9dd7454d7-r5r8x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-identmapper:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "aktørId": "2803487435806"
        }
    """.trimIndent(),
    """
        {
          "aktørId": "2618633343329",
          "cv": null,
          "arbeidsmarkedCv": {
            "meldingstype": "SLETT",
            "endretAv": "SYSTEMBRUKER",
            "opprettCv": null,
            "endreCv": null,
            "slettCv": null,
            "opprettJobbprofil": null,
            "endreJobbprofil": null,
            "slettJobbprofil": null,
            "aktoerId": "2618633343329",
            "sistEndret": 1672228350.454
          },
          "veileder": null,
          "oppfølgingsinformasjon": {
            "fodselsnummer": "28877798234",
            "formidlingsgruppe": "ARBS",
            "iservFraDato": null,
            "fornavn": "LYKKELIG",
            "etternavn": "FOXTROT",
            "oppfolgingsenhet": "2012",
            "kvalifiseringsgruppe": "IVURD",
            "rettighetsgruppe": "IYT",
            "hovedmaal": "SKAFFEA",
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-28T12:50:56+01:00"
          },
          "siste14avedtak": null,
          "oppfølgingsperiode": {
            "uuid": "7e84ec71-e193-4d37-a62c-68178987b94e",
            "aktorId": "2618633343329",
            "startDato": "2022-12-28T12:50:53.258511+01:00",
            "sluttDato": null
          },
          "fritattKandidatsøk": null,
          "hjemmel": null,
          "måBehandleTidligereCv": null,
          "tilretteleggingsbehov": null,
          "@id": "f20e2e1b-200d-4e0f-a7a5-423545b68ec4",
          "@opprettet": "2022-12-28T12:52:35.491665768",
          "system_read_count": 2,
          "system_participating_services": [
            {
              "id": "245982c2-82b5-4ea7-9c83-89b0db32fcdf",
              "time": "2022-12-28T12:52:35.468092492",
              "service": "toi-arbeidsmarked-cv",
              "instance": "toi-arbeidsmarked-cv-67545c87c7-clzzz",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-arbeidsmarked-cv:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "245982c2-82b5-4ea7-9c83-89b0db32fcdf",
              "time": "2022-12-28T12:52:35.474953389",
              "service": "toi-sammenstille-kandidat",
              "instance": "toi-sammenstille-kandidat-946f9c5c9-pckn4",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-sammenstille-kandidat:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "f20e2e1b-200d-4e0f-a7a5-423545b68ec4",
              "time": "2022-12-28T12:52:35.495606838",
              "service": "toi-synlighetsmotor",
              "instance": "toi-synlighetsmotor-9749795d7-qj75x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-synlighetsmotor:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "@event_name": "arbeidsmarked-cv.sammenstilt",
          "synlighet": {
            "erSynlig": false,
            "ferdigBeregnet": true,
            "evalueringUtenDiskresjonskode": {
              "harAktivCv": false,
              "harJobbprofil": false,
              "harSettHjemmel": false,
              "maaIkkeBehandleTidligereCv": true,
              "erIkkeFritattKandidatsøk": true,
              "erUnderOppfoelging": true,
              "harRiktigFormidlingsgruppe": true,
              "erIkkeSperretAnsatt": true,
              "erIkkeDoed": true
            }
          }
        }
    """.trimIndent(),
    """
        {
          "aktørId": "2618633343329",
          "oppfølgingsperiode": {
            "uuid": "7e84ec71-e193-4d37-a62c-68178987b94e",
            "aktorId": "2618633343329",
            "startDato": "2022-12-28T12:50:53.258511+01:00",
            "sluttDato": null
          },
          "@id": "a40925ae-e7bc-440c-a12f-e67bde548ee2",
          "@opprettet": "2022-12-28T12:50:57.966748235",
          "system_read_count": 2,
          "system_participating_services": [
            {
              "id": "cec61162-e310-402c-b033-171901b751e8",
              "time": "2022-12-28T12:50:57.937554856",
              "service": "toi-oppfolgingsperiode",
              "instance": "toi-oppfolgingsperiode-7646dcf59d-c98r2",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsperiode:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "cec61162-e310-402c-b033-171901b751e8",
              "time": "2022-12-28T12:50:57.944796141",
              "service": "toi-sammenstille-kandidat",
              "instance": "toi-sammenstille-kandidat-946f9c5c9-pckn4",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-sammenstille-kandidat:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "a40925ae-e7bc-440c-a12f-e67bde548ee2",
              "time": "2022-12-28T12:50:57.972707177",
              "service": "toi-synlighetsmotor",
              "instance": "toi-synlighetsmotor-9749795d7-qj75x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-synlighetsmotor:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "@event_name": "oppfølgingsperiode.sammenstilt",
          "synlighet": {
            "erSynlig": false,
            "ferdigBeregnet": false,
            "evalueringUtenDiskresjonskode": {
              "harAktivCv": false,
              "harJobbprofil": false,
              "harSettHjemmel": false,
              "maaIkkeBehandleTidligereCv": false,
              "erIkkeFritattKandidatsøk": false,
              "erUnderOppfoelging": false,
              "harRiktigFormidlingsgruppe": false,
              "erIkkeSperretAnsatt": false,
              "erIkkeDoed": false
            }
          }
        }
    """.trimIndent(),
    """
        {
          "fodselsnummer": "07067106126",
          "oppfølgingsinformasjon": {
            "fodselsnummer": "07067106126",
            "formidlingsgruppe": "IARBS",
            "iservFraDato": null,
            "fornavn": "Sitrongul",
            "etternavn": "Ingress",
            "oppfolgingsenhet": "0111",
            "kvalifiseringsgruppe": "VARIG",
            "rettighetsgruppe": "AAP",
            "hovedmaal": "OKEDELT",
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-27T08:34:38+01:00"
          },
          "@event_name": "oppfølgingsinformasjon",
          "@id": "ed539830-56ba-4363-8704-41a120ae5b9f",
          "@opprettet": "2022-12-27T08:35:03.172578743",
          "system_read_count": 1,
          "system_participating_services": [
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.172578743",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.180677290",
              "service": "toi-identmapper",
              "instance": "toi-identmapper-9dd7454d7-r5r8x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-identmapper:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "aktørId": "2688175577173"
        }
    """.trimIndent(),
    """
        {
          "aktørId": "2688175577173",
          "cv": null,
          "arbeidsmarkedCv": {
            "meldingstype": "SLETT",
            "endretAv": "SYSTEMBRUKER",
            "opprettCv": null,
            "endreCv": null,
            "slettCv": null,
            "opprettJobbprofil": null,
            "endreJobbprofil": null,
            "slettJobbprofil": null,
            "aktoerId": "2688175577173",
            "sistEndret": 1672122871.499
          },
          "veileder": null,
          "oppfølgingsinformasjon": {
            "fodselsnummer": "07067106126",
            "formidlingsgruppe": "IARBS",
            "iservFraDato": null,
            "fornavn": "Sitrongul",
            "etternavn": "Ingress",
            "oppfolgingsenhet": "0111",
            "kvalifiseringsgruppe": "VARIG",
            "rettighetsgruppe": "AAP",
            "hovedmaal": "OKEDELT",
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-27T08:34:38+01:00"
          },
          "siste14avedtak": {
            "aktorId": "2688175577173",
            "innsatsgruppe": "VARIG_TILPASSET_INNSATS",
            "hovedmal": "SKAFFE_ARBEID",
            "fattetDato": "2022-11-01T00:00:00+01:00",
            "fraArena": true
          },
          "oppfølgingsperiode": {
            "uuid": "0e3f50e0-8722-447e-a38b-425e593c53ae",
            "aktorId": "2688175577173",
            "startDato": "2022-12-27T07:33:16.739524+01:00",
            "sluttDato": null
          },
          "fritattKandidatsøk": null,
          "hjemmel": null,
          "måBehandleTidligereCv": null,
          "tilretteleggingsbehov": null,
          "@id": "31404486-9a79-450d-add7-2bd6f0436b79",
          "@opprettet": "2022-12-27T08:35:03.231226075",
          "system_read_count": 3,
          "system_participating_services": [
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.172578743",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.180677290",
              "service": "toi-identmapper",
              "instance": "toi-identmapper-9dd7454d7-r5r8x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-identmapper:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.208621257",
              "service": "toi-sammenstille-kandidat",
              "instance": "toi-sammenstille-kandidat-946f9c5c9-pckn4",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-sammenstille-kandidat:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "31404486-9a79-450d-add7-2bd6f0436b79",
              "time": "2022-12-27T08:35:03.283867731",
              "service": "toi-synlighetsmotor",
              "instance": "toi-synlighetsmotor-9749795d7-qj75x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-synlighetsmotor:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "@event_name": "oppfølgingsinformasjon.sammenstilt",
          "synlighet": {
            "erSynlig": false,
            "ferdigBeregnet": true,
            "evalueringUtenDiskresjonskode": {
              "harAktivCv": false,
              "harJobbprofil": false,
              "harSettHjemmel": false,
              "maaIkkeBehandleTidligereCv": true,
              "erIkkeFritattKandidatsøk": true,
              "erUnderOppfoelging": true,
              "harRiktigFormidlingsgruppe": true,
              "erIkkeSperretAnsatt": true,
              "erIkkeDoed": true
            }
          }
        }
    """.trimIndent()
)

val invalidJsonEvent = """
        {
          "fodselsnummer": "07067106126",
          "oppfølgingsinformasjon": {
            "fodselsnummer": "07067106126",
            "formidlingsgruppe": "IARBS",
            "iservFraDato": null,
            "fornavn": "Sitrongul",
            "etternavn": "Ingress",
            "oppfolgingsenhet": "0111",
            "kvalifiseringsgruppe": "VARIG",
            "rettighetsgruppe": "AAP",
            "hovedmaal": "OKEDELT",
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-27T08:34:38+01:00"
          },
          "@event_name": "oppfølgingsinformasjon",
          "@id": "ed539830-56ba-4363-8704-41a120ae5b9f",
          "@opprettet": "2022-12-27T08:35:03.172578743",
          "system_read_count": 1,
          "system_participating_services": [
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.172578743",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.180677290",
              "service": "toi-identmapper",
              "instance": "toi-identmapper-9dd7454d7-r5r8x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-identmapper:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "aktørId": "2688175577173",
        }
""".trimIndent()
private val invalidSystemParticipatingServicesEvent = """
        {
          "fodselsnummer": "07067106126",
          "oppfølgingsinformasjon": {
            "fodselsnummer": "07067106126",
            "formidlingsgruppe": "IARBS",
            "iservFraDato": null,
            "fornavn": "Sitrongul",
            "etternavn": "Ingress",
            "oppfolgingsenhet": "0111",
            "kvalifiseringsgruppe": "VARIG",
            "rettighetsgruppe": "AAP",
            "hovedmaal": "OKEDELT",
            "sikkerhetstiltakType": null,
            "diskresjonskode": null,
            "harOppfolgingssak": true,
            "sperretAnsatt": false,
            "erDoed": false,
            "doedFraDato": null,
            "sistEndretDato": "2022-12-27T08:34:38+01:00"
          },
          "@event_name": "oppfølgingsinformasjon",
          "@id": "ed539830-56ba-4363-8704-41a120ae5b9f",
          "@opprettet": "2022-12-27T08:35:03.172578743",
          "system_read_count": 1,
          "system_participating_services": {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.172578743",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
          "aktørId": "2688175577173"
        }
""".trimIndent()

fun dummyEvent(eventName: String = "") = """
        {
          "@event_name": "$eventName",
          "system_participating_services": [
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.172578743",
              "service": "toi-oppfolgingsinformasjon",
              "instance": "toi-oppfolgingsinformasjon-59d48ccf8b-72nxv",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-oppfolgingsinformasjon:333dd8d9c539a459adbb27470d7151656f9b1a90"
            },
            {
              "id": "ed539830-56ba-4363-8704-41a120ae5b9f",
              "time": "2022-12-27T08:35:03.180677290",
              "service": "toi-identmapper",
              "instance": "toi-identmapper-9dd7454d7-r5r8x",
              "image": "ghcr.io/navikt/toi-rapids-and-rivers/toi-identmapper:333dd8d9c539a459adbb27470d7151656f9b1a90"
            }
          ],
          "aktørId": "2688175577173"
        }
""".trimIndent()

