import ListofPlayers from "./ListofPlayers";
import IndianTeam, {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
} from "./Players";

function App() {
  const flag = true;

  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 },
  ];

  if (flag) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
      </div>
    );
  }

  return (
    <div>
      <h1>Odd Players</h1>
      {OddPlayers(IndianTeam)}

      <hr />

      <h1>Even Players</h1>
      {EvenPlayers(IndianTeam)}

      <hr />

      <h1>Merged Players</h1>

      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;