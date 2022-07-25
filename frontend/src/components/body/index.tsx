import "./index.css";

const Body = () => {
  return (
    <>
      <img src="https://img.freepik.com/fotos-gratis/jovem-medico-bonito-em-uma-tunica-medica-com-estetoscopio_1303-17818.jpg?size=626&ext=jpg&ga=GA1.2.951277740.1658703495" />
      <ul>
        <li><a href='#'>Create a Healthcare</a></li>
        <li><a href='#createexam'>Create an exam</a></li>
        <li><a href='#listexams'>List exams</a></li>
        <li><a href='#updateexam'>Update an exam</a></li>
        <li><a href='#deleteexam'>Delete an exam</a></li>
        <li><a href='findbyid'> Get an exam by its identifier</a></li>
      </ul>
    </>
  );
};

export default Body;
