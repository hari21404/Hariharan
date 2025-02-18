// Creating the student object
let student = {
    id: 101,
    name: "John Doe",
    department: "Computer Science",
    college: "XYZ University",
    email: "john.doe@example.com",
};

student.displayAllDetails=function()
{   console.log("ID: "+ this.id);
    console.log("Name: "+ this.name);
    console.log("Department: "+ this.department);
    console.log("College: "+ this.college);
    console.log("Email: " + this.email );
}
student.displayBasicDetails=function()
{
    console.log("ID: "+ this.id);
    console.log("Name: "+ this.name);
    console.log("Email: " + this.email );
}
console.log("Displaying all details:");
student.displayAllDetails();

console.log("Displaying basic details:");
student.displayBasicDetails();

student.address = {
    doorNo: "123",
    street: "Street",
    area: "area",
    pincode: "123456"
};

student.displayDetailsWithAddress = function () {
    console.log("ID: "+ this.id);
    console.log("Name: "+ this.name);
    console.log("Department: "+ this.department);
    console.log("College: "+ this.college);
    console.log("Email: " + this.email );
    console.log("Address: "+this.address.doorNo  +" "+this.address.street+" "+this.address.area+" "+this.address.pincode);
};


console.log("Displaying details with address:");
student.displayDetailsWithAddress();


delete student.email;
delete student.displayBasicDetails;

console.log("After deleting email and basic details function:");
console.log(student);
