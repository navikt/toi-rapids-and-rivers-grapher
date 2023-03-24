# Autogenerer graph for trafikken på toi-rapiden
Denne applikasjonen kjører hver midnatt og logger en mermaid-graph som viser hvordan applikasjonene på rapiden prater sammen:

Oppdatert 2023-03-24
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;
```
arbeidsmarked-cv.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv:::x --> toi-sammenstille-kandidat:::x;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 15,18,19,22,23,25,26,29,30,31,33 stroke:red;
classDef x stroke: red;
```
arbeidsmarked-cv
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
fritatt-kandidatsøk
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok:::x --> toi-identmapper:::x;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 16 stroke:red;
classDef x stroke: red;
```
fritatt-kandidatsøk.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok:::x --> toi-identmapper:::x;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper:::x --> toi-sammenstille-kandidat:::x;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 16,18,19,21,22,23,25,26,29,30,31,33 stroke:red;
classDef x stroke: red;
```
oppfølgingsinformasjon
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon:::x --> toi-identmapper:::x;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 27 stroke:red;
classDef x stroke: red;
```
oppfølgingsinformasjon.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper:::x --> toi-sammenstille-kandidat:::x;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon:::x --> toi-identmapper:::x;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,21,22,23,25,26,27,29,30,31,33 stroke:red;
classDef x stroke: red;
```
hjemmel
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
hjemmel.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel:::x --> toi-sammenstille-kandidat:::x;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 17,18,19,22,23,25,26,29,30,31,33 stroke:red;
classDef x stroke: red;
```
veileder
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
veileder.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder:::x --> toi-sammenstille-kandidat:::x;

linkStyle 18,19,22,23,25,26,29,30,31,33,35 stroke:red;
classDef x stroke: red;
```
kandidat_v2.RegistrertFåttJobben
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.LukketKandidatliste
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api:::x --> foresporsel-om-deling-av-cv-api:::x;
foresporsel-om-deling-av-cv-api:::x --> rekrutteringsbistand-stilling-api:::x;
presenterte-kandidater-api:::x --> presenterte-kandidater-api:::x;
presenterte-kandidater-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-kandidat-api:::x --> foresporsel-om-deling-av-cv-api:::x;
rekrutteringsbistand-kandidat-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api:::x --> foresporsel-om-deling-av-cv-api:::x;
rekrutteringsbistand-stilling-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 0,1,2,3,4,5,7,11,12,14 stroke:red;
classDef x stroke: red;
```
oppfølgingsperiode
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
oppfølgingsperiode.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode:::x --> toi-sammenstille-kandidat:::x;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,22,23,25,26,28,29,30,31,33 stroke:red;
classDef x stroke: red;
```
må-behandle-tidligere-cv
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
må-behandle-tidligere-cv.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv:::x --> toi-sammenstille-kandidat:::x;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,22,23,24,25,26,29,30,31,33 stroke:red;
classDef x stroke: red;
```
unknown event
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api:::x --> toi-identmapper:::x;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper:::x --> rekrutteringsbistand-statistikk-api:::x;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 8,10,20 stroke:red;
classDef x stroke: red;
```
tilretteleggingsbehov
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
tilretteleggingsbehov.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov:::x --> toi-sammenstille-kandidat:::x;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,22,23,25,26,29,30,31,33,34 stroke:red;
classDef x stroke: red;
```
siste14avedtak
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;


```
siste14avedtak.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak:::x --> toi-sammenstille-kandidat:::x;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,22,23,25,26,29,30,31,32,33 stroke:red;
classDef x stroke: red;
```
kandidat_v2.OppdaterteKandidatliste
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
arbeidsgiversKandidatliste.VisningKontaktinfo
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 8 stroke:red;
classDef x stroke: red;
```
kandidat_v2.DelCvMedArbeidsgiver
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api:::x --> foresporsel-om-deling-av-cv-api:::x;
foresporsel-om-deling-av-cv-api:::x --> rekrutteringsbistand-stilling-api:::x;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api:::x --> foresporsel-om-deling-av-cv-api:::x;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api:::x --> foresporsel-om-deling-av-cv-api:::x;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 0,1,4,6,7,8,9,11,13,14 stroke:red;
classDef x stroke: red;
```
notifikasjon.cv-delt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.OpprettetKandidatliste
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.RegistrertDeltCv
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.SlettFraArbeidsgiversKandidatliste
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api:::x --> presenterte-kandidater-api:::x;
presenterte-kandidater-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 2,3,5,7,12,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.SlettetStillingOgKandidatliste
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api:::x --> presenterte-kandidater-api:::x;
presenterte-kandidater-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api:::x --> presenterte-kandidater-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 2,3,5,7,8,12,13,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.FjernetRegistreringFåttJobben
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
kandidat_v2.FjernetRegistreringDeltCv
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api:::x --> rekrutteringsbistand-stilling-api:::x;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-stilling-api:::x --> rekrutteringsbistand-stilling-api:::x;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 7,8,13,14 stroke:red;
classDef x stroke: red;
```
republisert.sammenstilt
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api --> toi-identmapper;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv:::x --> toi-hull-i-cv:::x;
toi-hull-i-cv:::x --> toi-ontologitjeneste:::x;
toi-identmapper --> rekrutteringsbistand-statistikk-api;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed:::x --> toi-kandidatfeed:::x;
toi-kandidatfeed:::x --> toi-organisasjonsenhet:::x;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste:::x --> toi-kandidatfeed:::x;
toi-ontologitjeneste:::x --> toi-ontologitjeneste:::x;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet:::x --> toi-hull-i-cv:::x;
toi-organisasjonsenhet:::x --> toi-organisasjonsenhet:::x;
toi-sammenstille-kandidat:::x --> toi-synlighetsmotor:::x;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor:::x --> toi-kandidatfeed:::x;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 18,19,22,23,25,26,29,30,31,33 stroke:red;
classDef x stroke: red;
```
<details>
<summary>tiltakAvtaleIngått</summary>
```mermaid
graph TD;
foresporsel-om-deling-av-cv-api --> foresporsel-om-deling-av-cv-api;
foresporsel-om-deling-av-cv-api --> rekrutteringsbistand-stilling-api;
presenterte-kandidater-api --> presenterte-kandidater-api;
presenterte-kandidater-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-kandidat-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-kandidat-api --> presenterte-kandidater-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-kandidat-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api:::x --> rekrutteringsbistand-statistikk-api:::x;
rekrutteringsbistand-statistikk-api --> rekrutteringsbistand-stilling-api;
rekrutteringsbistand-statistikk-api:::x --> toi-identmapper:::x;
rekrutteringsbistand-stilling-api --> foresporsel-om-deling-av-cv-api;
rekrutteringsbistand-stilling-api --> presenterte-kandidater-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-statistikk-api;
rekrutteringsbistand-stilling-api --> rekrutteringsbistand-stilling-api;
toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
toi-fritatt-kandidatsok --> toi-identmapper;
toi-hjemmel --> toi-sammenstille-kandidat;
toi-hull-i-cv --> toi-hull-i-cv;
toi-hull-i-cv --> toi-ontologitjeneste;
toi-identmapper:::x --> rekrutteringsbistand-statistikk-api:::x;
toi-identmapper --> toi-sammenstille-kandidat;
toi-kandidatfeed --> toi-kandidatfeed;
toi-kandidatfeed --> toi-organisasjonsenhet;
toi-maa-behandle-tidligere-cv --> toi-sammenstille-kandidat;
toi-ontologitjeneste --> toi-kandidatfeed;
toi-ontologitjeneste --> toi-ontologitjeneste;
toi-oppfolgingsinformasjon --> toi-identmapper;
toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
toi-organisasjonsenhet --> toi-hull-i-cv;
toi-organisasjonsenhet --> toi-organisasjonsenhet;
toi-sammenstille-kandidat --> toi-synlighetsmotor;
toi-siste-14a-vedtak --> toi-sammenstille-kandidat;
toi-synlighetsmotor --> toi-kandidatfeed;
toi-tilretteleggingsbehov --> toi-sammenstille-kandidat;
toi-veileder --> toi-sammenstille-kandidat;

linkStyle 8,10,20 stroke:red;
classDef x stroke: red;
```
</details>


# Definisjoner 

## RapidService
En applikasjon som leser/skriver eventer på rapid

## Graph
Noder og kanter som viser en oversikt over eventer mellom applikasjoner

### Node
Node-representasjon av en rapid-service. 
#### Edge
Edge-representasjon av event som går  mellom to rapid-servicer
Brukes inne i node for å vise hva som er neste node den peker på.

## Event
Melding fra rapid

## MermaidGraph
Visualisering av mermaid-grafer basert på tekstedefinisjoner som kan tolkes i markup

### MermaidTextDefinition
En linje i MermaidGraph


