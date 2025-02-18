function sod(x)
{   let sum=0;
    while(x)
    {
        sum=sum+(x%10);
        x=Math.floor(x/10);
    }
    if(sum%2==0)
        console.log("Even")
    else
        console.log("odd")
}
sod(105);