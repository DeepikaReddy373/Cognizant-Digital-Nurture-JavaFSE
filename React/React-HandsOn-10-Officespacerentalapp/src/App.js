import './App.css';

function App() {

  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=500"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Hyderabad",
      Image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=500"
    },
    {
      Name: "Regus",
      Rent: 60000,
      Address: "Bangalore",
      Image: "https://images.unsplash.com/photo-1497366216548-37526070297c?w=500"
    }
  ];

  return (
    <div style={{ marginLeft: "40px" }}>
      <h1>Office Space, at Affordable Range</h1>

      {offices.map((office, index) => (
        <div key={index} style={{ marginBottom: "40px" }}>
          <img
            src={office.Image}
            alt="Office Space"
            width="300"
            height="200"
          />

          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;