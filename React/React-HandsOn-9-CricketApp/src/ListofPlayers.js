function ListofPlayers({ players }) {
  return (
    <div>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            Mr. {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export function Scorebelow70({ players }) {
  const filteredPlayers = players.filter((player) => player.score <= 70);

  return (
    <div>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            Mr. {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;