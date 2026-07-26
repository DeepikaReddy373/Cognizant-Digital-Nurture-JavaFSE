import "../Stylesheets/mystyle.css";

const percentToDecimal = (decimal) => {
  return (decimal / 100).toLocaleString(undefined, {
    style: "percent",
    minimumFractionDigits: 2,
  });
};

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal);
};

export function CalculateScore({ Name, School, total, goal }) {
  return (
    <div className="formatstyle">
      <h1>
        <font color="brown">Student Details:</font>
      </h1>

      <p><b>Name:</b> {Name}</p>
      <p><b>School:</b> {School}</p>
      <p><b>Total:</b> {total} Marks</p>
      <p><b>Score:</b> {calcScore(total, goal)}</p>
    </div>
  );
}