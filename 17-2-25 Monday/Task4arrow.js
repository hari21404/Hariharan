
arr=()=>
{
    ch=Number(prompt("Enter the choise(1.add,2..sub,3.mul,4.div)"));
    a=Number(prompt("Enter the 1no"));
    b=Number(prompt("Enter the 2no"));
    res=0;
    switch(ch)
{
    case 1:
        res=add();
        break;
    case 2:
        res=sub();
        break ;   
    case 3:
        res=mul();
        break;
    case 4:
        res=div();
        break ;   
        
}

}
add=()=>a+b;
sub=()=>a-b;
mul=()=>a*b;
div=()=>a/b;

var ch,a,b,res;
arr();

console.log(res)