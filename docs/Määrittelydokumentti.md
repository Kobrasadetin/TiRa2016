## Harjoitustyö: neuroverkkojen ominaisuuksien vertailua
Tässä harjoitustyössä toteutan muutaman aktivaatiofunktioltaan erilaisen neuroverkon, ja vertailen niiden ominaisuuksia eri koulutusmenetelmiä käytettäessä. Ohjelmointikieli on Java.

#### Toteutettavat algoritmit ja tietorakenteet
Luodaan testiympäristö, jossa neuroverkkojen oppimisnopeutta, tarkkuutta ja muita ominaisuuksia verrataan. Kaikki toteutettavat neuroverkot tulevat olevaan perusrakenteeltaan samankaltaisia eteenpäinsyöttäviä neuroverkkoja. Kullakin neuroverkolla on yksi tai useampia kerroksia, ja jokainen kerros sisältää yhden tai useamman neuronin. Nämä esitetään Javassa luokkina. Verkon vastinneen tuottaminen syötteestä tapahtuu rekursiivisella 

#### Mitä ongelmaa ratkaiset ja miksi valitsit kyseiset algoritmit/tietorakenteet
Neuroverkot ovat viime vuosina olleet suosittu tapa ratkaista koneoppimisen ongelmia. Teoriassa mikä tahansa ei-lineaarinen aktivaatiofunktio tekee neuroverkosta universaalin approksimaattorin mille tahansa jatkuvalle funktiolle. Lineaarisia aktivaatiofunktioita käyttämällä neuroverkko on tukivektorikone. Saattaa olla kiinnostavaa tutkia miten eri aktivaatiofunktiot vaikuttavat verkon oppimisnopeuteen ja -tarkkuuteen. Opetusmetodeina käytetään ainakin virheen takaisinsyöttöä ja geneettistä algoritmia.

#### Mitä syötteitä ohjelma saa ja miten näitä käytetään
Ohjelma saa syötteenä luokiteltavan aineiston tai approksimoitavan funktion, kouluttaa valitulla strategialla neuroverkon ja palauttaa tiedon saavutetuista tuloksista.

#### Tavoitteena olevat aika- ja tilavaativuudet (mm. O-analyysit)
Eri koulutusmenetelmien aikavaatimukset ovat yksi projektin aikana tutkittavista asioista. 

#####Lähteet:
internetlähteet:
https://en.wikipedia.org/wiki/Artificial_neural_network
**cross-entropy cost function**
http://neuralnetworksanddeeplearning.com/chap3.html#the_cross-entropy_cost_function
**incremental extreme learning machine**
http://www.ntu.edu.sg/home/egbhuang/pdf/I-ELM.pdf
**speeding up sigmoid***
http://ybeernet.blogspot.fi/2011/03/speeding-up-sigmoid-function-by.html

Kirjallisuutta tarkennetaan myöhemmin.
