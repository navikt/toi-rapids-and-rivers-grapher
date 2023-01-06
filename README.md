# Autogenerer graph over trafikken på toi-rapiden
Denne applikasjonen kjører hver midnatt og logger en mermaid-graf som viser hvordan applikasjonene på rapiden prater sammen:

```mermaid
graph TD;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-identmapper --> toi-sammenstille-kandidat;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-cv --> toi-sammenstille-kandidat;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;
presenterte-kandidater-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api;
foresporsel-om-deling-av-cv-api;
```
