const IndianTeam = [
  "Sachin",
  "Dhoni",
  "Virat",
  "Rohit",
  "Yuvraj",
  "Raina"
];

// Odd Players
export function OddPlayers([first, , third, , fifth]) {
  return (
    <ul>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </ul>
  );
}

// Even Players
export function EvenPlayers([, second, , fourth, , sixth]) {
  return (
    <ul>
      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>
    </ul>
  );
}

// Merge Arrays
const T20Players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const RanjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

export const IndianPlayers = [
  ...T20Players,
  ...RanjiPlayers
];

export default IndianTeam;