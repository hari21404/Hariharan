
import React from "react";
import ReactDOM from "react-dom/client";

function Student(props)
{
    return <li>{props.name} - {props.dept}</li>
}

function StudentList()
{
const students =[{name :"Hari",dept:"ECE"},
    {name :"Arun",dept:"ECE"},
    {name :"Gowtham",dept:"ECE"}
]

return(
<div>
    <h1> Student List</h1>
    <ul>
        {students.map((student) => <Student  dept={student.dept}  name={student.name} />)}
    </ul>
</div>)
}



export default StudentList;