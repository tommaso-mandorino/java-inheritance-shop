# Esercizio `Java Inheritance Shop`

1) Creare la **classe** `Prodotto` che gestisce i prodotti di uno shop, caratterizzati da:
    - `codice` (numero intero);
    - `nome`;
    - `marca`;
    - `prezzo`;
    - `iva`.

2) Usare opportunamente i **livelli di accesso** (public, private), i **costruttori**, i **metodi getter e setter** ed **eventuali altri metodi di “utilità”** per fare in modo che:
    - il `codice prodotto` sia accessibile **solo in lettura**;
    - gli `altri attributi` siano accessibili sia in **lettura** che in **scrittura**.

3) Avvalendosi dell’**ereditarietà**, **riutilizzare il codice** di `Prodotto` nella stesura delle **classi** che gestiscono i vari **sottotipi** di prodotto, ovvero:
    - `Smarphone`, caratterizzati anche dal `codice IMEI` e dalla `quantità di memoria`;
    - `Televisori`, caratterizzati dalle `dimensioni` e dalla proprietà di essere `smart` oppure no;
    - `Cuffie`, caratterizzate dal `colore` e se sono `wireless` o `cablate`.

## Parte 2

Creare una **classe** `Carrello` con **metodo** `main`, in cui chiedere all’utente di valorizzare un **carrello di prodotti** con dati inseriti tramite `Scanner`.

Per fare ciò, chiedere all’utente se sta inserendo uno `Smarphone`, un `Televisore` o un paio di `Cuffie` e, in base alla scelta effettuata, utilizzare il **costruttore** opportuno.

Al termine dell’inserimento **stampare il carrello**, applicando per ogni classe l’**override del metodo** `toString`, in modo da restituire le relative informazioni da stampare adattate alla specifica tipologia di prodotto.

### Bonus

Aggiungere alla **classe** `Prodotto` un **metodo** per il **calcolo del prezzo scontato per clienti con tessera fedeltà**, che applica al prezzo uno **sconto del 2%**, tenendo conto delle seguenti **eccezioni**:

- per gli `Smartphone`, lo sconto è del **5%** se la quantità di **memoria è inferiore a 32GB**;

- per i `Televisori` lo sconto è del **10% se la televisione non è smart**;

- per le `Cuffie` lo sconto è del **7% se sono cablate**.

Per fare ciò, nella **classe** `Carrello` chiedere all’utente se possiede una carta fedeltà e, in base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.

### Super Bonus

1) Chiedere all'utente di inserire il codice della propria tessera fedeltà.

2) Confrontare il codice ottenuto con quelli presenti nel sistema (memorizzati ad esempio in un **array statico**).

3) Se il codice è tra quelli memorizzati applicare lo sconto, altrimenti no.