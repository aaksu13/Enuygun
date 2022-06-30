Feature: Flight Ticket Page

As Osman
He want see flight ticket page

Scenario Outline: Osman sees the flight ticket page
  * Ahmet chooses rato "<whereFrom>" and "<toWhere>"
  * Ahmet chooses round trip date "<departureDate>" and "<dateOfReturn>"
  * Ahmet chooses non-stop flight
  * Ahmet chooses the number of passengers,ticket class "<passengers>" and "<ticketClass>"
  * Ahmet presses the search button
  * Ahmet sees the flight ticket page
  Examples:
    | whereFrom | toWhere | departureDate | dateOfReturn | passengers | ticketClass |
    | Esenboğa  | Sabiha Gökçen | Perşembe, 28 Nisan 2022 | Pazar, 1 Mayıs 2022 | 5 | Business |