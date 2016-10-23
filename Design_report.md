# Design Report for tictactoe

##T-303-HUGB Hugbúnaðarfræði  -  late term assignment
Bjarnabofarnir<br />
Emil Hjaltason<br />
Hanna Ragnarsdóttir<br />
Haukur Halldórsson<br />
Hulda Lilja Hannesdóttir<br />
Magnús Þorsteinsson<br />
Þórhildur Þorleiksdóttir<br />

##The class diagram for tictactoe
To get a good overview and to make sure that all members would
agree on the initial design we made a class diagram which can
be seen below.
This is the inital design and will likely change in the process.
[![klasarit_tictactoe.jpg](https://s22.postimg.org/l8olrxc81/klasarit_tictactoe.jpg)](https://postimg.org/image/3vebd2gwt/)
Clearifications:<br />
HumanPlayer and Computer inherit from Player since they have a lot in common. The only difference is how getMove() is generated to
return a Point that represented the cell chosen for a round. Therefore getMoce() has to be implimented in both those classes but
only declared in Player.

Computer uses Seed to get a random cell where x and y is on the range 0-MAX. To make sure of that Seed is initialized with
appropriate MAX number.

No class owns an instance of Point but it is used to send position of a cell between classes and functions.

Board has two dimension array of Cell with the size MAX*MAX and uses the two dimension array to keep track of the cells location.
For example the cell[0][2] stands for the cell with x=0 and y=2(starts with 0).

TicTacToe is the class that connects everything togehter. It makes the game start and keeps it running as long as needed.

##Coding rules
All functions' start with lower case and every other word followed it a capital letter.
All variables use the same naming rule as functions.
Classes start with capital letter and otherwise the same rule as functions.

##Coding methods
We use TTD. Starting by making a test and see it fail. Then we code so that the test is successful and then we can commit
or if appropriate refactor first.
We make branch for every featus and work in pairs most of the time.
