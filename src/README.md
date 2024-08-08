Day 6: Wait For It ---
The ferry quickly brings you across Island Island. After asking around, you discover that there is indeed normally a large pile of sand somewhere near here, but you don't see anything besides lots of water and the small island where the ferry has docked.

As you try to figure out what to do next, you notice a poster on a wall near the ferry dock. "Boat races! Open to the public! Grand prize is an all-expenses-paid trip to Desert Island!" That must be where the sand comes from! Best of all, the boat races are starting in just a few minutes.

You manage to sign up as a competitor in the boat races just in time. The organizer explains that it's not really a traditional race - instead, you will get a fixed amount of time during which your boat has to travel as far as it can, and you win if your boat goes the farthest.

As part of signing up, you get a sheet of paper (your puzzle input) that lists the time allowed for each race and also the best distance ever recorded in that race. To guarantee you win the grand prize, you need to make sure you go farther in each race than the current record holder.

The organizer brings you over to the area where the boat races are held. The boats are much smaller than you expected - they're actually toy boats, each with a big button on top. Holding down the button charges the boat, and releasing the button allows the boat to move. Boats move faster if their button was held longer, but time spent holding the button counts against the total race time. You can only hold the button at the start of the race, and boats don't move until the button is released.

For example:

Time:      7  15   30
Distance:  9  40  200
This document describes three races:

The first race lasts 7 milliseconds. The record distance in this race is 9 millimeters.
The second race lasts 15 milliseconds. The record distance in this race is 40 millimeters.
The third race lasts 30 milliseconds. The record distance in this race is 200 millimeters.
Your toy boat has a starting speed of zero millimeters per millisecond. For each whole millisecond you spend at the beginning of the race holding down the button, the boat's speed increases by one millimeter per millisecond.

So, because the first race lasts 7 milliseconds, you only have a few options:

Don't hold the button at all (that is, hold it for 0 milliseconds) at the start of the race. The boat won't move; it will have traveled 0 millimeters by the end of the race.
Hold the button for 1 millisecond at the start of the race. Then, the boat will travel at a speed of 1 millimeter per millisecond for 6 milliseconds, reaching a total distance traveled of 6 millimeters.
Hold the button for 2 milliseconds, giving the boat a speed of 2 millimeters per millisecond. It will then get 5 milliseconds to move, reaching a total distance of 10 millimeters.
Hold the button for 3 milliseconds. After its remaining 4 milliseconds of travel time, the boat will have gone 12 millimeters.
Hold the button for 4 milliseconds. After its remaining 3 milliseconds of travel time, the boat will have gone 12 millimeters.
Hold the button for 5 milliseconds, causing the boat to travel a total of 10 millimeters.
Hold the button for 6 milliseconds, causing the boat to travel a total of 6 millimeters.
Hold the button for 7 milliseconds. That's the entire duration of the race. You never let go of the button. The boat can't move until you let go of the button. Please make sure you let go of the button so the boat gets to move. 0 millimeters.
Since the current record for this race is 9 millimeters, there are actually 4 different ways you could win: you could hold the button for 2, 3, 4, or 5 milliseconds at the start of the race.

In the second race, you could hold the button for at least 4 milliseconds and at most 11 milliseconds and beat the record, a total of 8 different ways to win.

In the third race, you could hold the button for at least 11 milliseconds and no more than 19 milliseconds and still beat the record, a total of 9 ways you could win.

To see how much margin of error you have, determine the number of ways you can beat the record in each race; in this example, if you multiply these values together, you get 288 (4 * 8 * 9).

Determine the number of ways you could beat the record in each race. What do you get if you multiply these numbers together?

To begin, get your puzzle input.

Answer:


You can also [Share] this puzzle.

Den 6: Počkejte na to ---
Trajekt vás rychle dopraví přes Island Island. Poté, co se budete ptát kolem, zjistíte, že někde poblíž je skutečně velká hromada písku, ale kromě spousty vody a malého ostrůvku, kde zakotvil trajekt, nevidíte nic.

Když se snažíte vymyslet, co dělat dál, všimnete si plakátu na zdi poblíž přístaviště trajektů. "Závody lodí! Otevřeno pro veřejnost! Hlavní cenou je výlet na Pouštní ostrov, který zaplatíte za všechny náklady!" Odtud musí písek pocházet! Nejlepší ze všeho je, že závody lodí začínají už za pár minut.

Stihnete se přihlásit jako soutěžící do závodů lodí právě včas. Pořadatel vysvětluje, že se ve skutečnosti nejedná o tradiční závod – místo toho dostanete pevně stanovený čas, během kterého musí vaše loď ujet tak daleko, jak jen může, a vyhrajete, pokud vaše loď dojede nejdál.

Jako součást registrace získáte list papíru (vaše zadání puzzle), na kterém je uveden čas povolený pro každý závod a také nejlepší vzdálenost, která byla kdy v daném závodě zaznamenána. Abyste zaručili výhru hlavní ceny, musíte se ujistit, že v každém závodě dojdete dále než aktuální držitel rekordu.

Pořadatel vás přivede do areálu, kde se konají závody lodí. Lodě jsou mnohem menší, než jste čekali – jsou to vlastně lodě na hraní, každá s velkým tlačítkem nahoře. Podržením tlačítka se člun nabije a uvolněním tlačítka se člun pohne. Lodě se pohybují rychleji, pokud je tlačítko drželo déle, ale čas strávený držením tlačítka se započítává do celkového času závodu. Tlačítko můžete držet pouze na začátku závodu a lodě se nepohnou, dokud tlačítko neuvolníte.

Například:

Čas: 7 15 30
Vzdálenost: 9 40 200
Tento dokument popisuje tři rasy:

První závod trvá 7 milisekund. Rekordní vzdálenost v tomto závodě je 9 milimetrů.
Druhý závod trvá 15 milisekund. Rekordní vzdálenost v tomto závodě je 40 milimetrů.
Třetí závod trvá 30 milisekund. Rekordní vzdálenost v tomto závodě je 200 milimetrů.
Vaše hračka má počáteční rychlost nula milimetrů za milisekundu. Za každou celou milisekundu, kterou strávíte na začátku závodu přidržením tlačítka, se rychlost lodi zvýší o jeden milimetr za milisekundu.

Takže, protože první závod trvá 7 milisekund, máte jen několik možností:

Na začátku závodu tlačítko vůbec nedržte (to znamená držte ho 0 milisekund). Loď se nepohne; do konce závodu urazí 0 milimetrů.
Na začátku závodu podržte tlačítko po dobu 1 milisekundy. Poté se člun bude pohybovat rychlostí 1 milimetr za milisekundu po dobu 6 milisekund a dosáhne celkové ujeté vzdálenosti 6 milimetrů.
Podržte tlačítko po dobu 2 milisekund, čímž loď dosáhne rychlosti 2 milimetry za milisekundu. Poté bude mít 5 milisekund na pohyb a dosáhne celkové vzdálenosti 10 milimetrů.
Podržte tlačítko po dobu 3 milisekund. Po zbývajících 4 milisekundách času plavby loď ujela 12 milimetrů.
Podržte tlačítko po dobu 4 milisekund. Po zbývajících 3 milisekundách času plavby loď urazí 12 milimetrů.
Podržte tlačítko po dobu 5 milisekund, čímž člun urazí celkem 10 milimetrů.
Podržte tlačítko po dobu 6 milisekund, čímž člun urazí celkem 6 milimetrů.
Podržte tlačítko po dobu 7 milisekund. To je celé trvání závodu. Nikdy nepustíte tlačítko. Loď se nemůže pohnout, dokud nepustíte tlačítko. Ujistěte se, že jste pustili tlačítko, aby se loď mohla pohybovat. 0 milimetrů.
Vzhledem k tomu, že současný rekord pro tento závod je 9 milimetrů, existují ve skutečnosti 4 různé způsoby, jak můžete vyhrát: na začátku závodu můžete držet tlačítko po dobu 2, 3, 4 nebo 5 milisekund.

Ve druhém závodě jste mohli držet tlačítko alespoň 4 milisekundy a maximálně 11 milisekund a překonat rekord, celkem 8 různých způsobů, jak vyhrát.

Ve třetím závodě jste mohli držet tlačítko alespoň 11 milisekund a ne více než 19 milisekund a přesto překonat rekord, celkem 9 způsobů, jak můžete vyhrát.

Chcete-li zjistit, kolik chyb máte, určete počet způsobů, jak můžete překonat rekord v každém závodě; v tomto příkladu, pokud tyto hodnoty vynásobíte dohromady, dostanete 288 (4 * 8 * 9).

Určete, kolika způsoby byste mohli překonat rekord v každém závodě. Co získáte, když tato čísla vynásobíte?

Chcete-li začít, získejte svůj puzzle vstup:
Čas:        61     67     75     71
Vzdálenost:   430   1036   1307   1150