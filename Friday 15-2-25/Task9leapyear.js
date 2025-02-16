let year=prompt("enter the year");
let month=prompt("Enter the month in number");
if(year%4 ==0)
{
    if(month==2)
        console.log("The year is leap year and the month is February with 29 days");
    else
        console.log("The year is leap year and the month is not February ");
}
else
    console.log("The given year is not a leap year");
