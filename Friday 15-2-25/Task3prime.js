function isPrime(n) {
	
	if (n <= 1)
	{
		console.log("The no is 1 or 0");
		return ;
	}	
	for (let i = 2; i < Math.sqrt(n); i++)
	  if (n % i == 0)
		{console.log("Not Prime")
		return ;}
	console.log("prime");	
	return ;
  }
  
const c=59
  
isPrime(c)
