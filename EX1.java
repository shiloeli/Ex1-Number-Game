

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = MyConsole.readInt("Enter a number:");
		int sum=0;
		int b=0;
		while(n%10!=0) {
			b=n%10;
			sum=sum+b;
			n=n/10;
		}
			
			int sum2=0;
			int a=0;
			while(sum%10!=0) {
				a=sum%10;
				sum2=sum2+a;
				sum=sum/10;
			}
			System.out.println(sum2);
	
	

			
			
			

			int ni = MyConsole.readInt("Enter a number:");
			int sumi=0;
			int bi=0;
		    int c=0;
		    
			while(ni!=0) {
				bi=ni%10;
				sumi+= bi*bi; 
				ni=ni/10;
				c=sumi;
			}
		
			    sumi=0;
			while(c!=0||sumi==0)
				{
					bi=c%10;
					sumi+= bi*bi;
					c=c/10;
					if(sumi==1)break;
					else
				if(c==0) {
					c=sumi;
			        sumi=0;
			     if(c==4) {
			    	 break;
			     }
			    }
				
					
					
				}	
				
			        
					if(sumi!=1) {
						System.out.println("false");
					}else{
					    System.out.println("true");
			   	}

				
					
					
					
					
					
					
					int number = MyConsole.readInt("Enter a number:");
			    	int res=0;
			    	int aa=number;
			    	while(aa!=0) {
			    		res*=10;
			    		res+=aa%10;
			    		aa/=10;
			    	}
			    
			    	if (res==number) {
			    		System.out.println("true");
			    	}else {
			    		System.out.println("false");
			    	}	
				
			    	
			    	
			    	
			    	
			    	
			    	
					int na = MyConsole.readInt("Enter a number:"); 
					int v=1;
					while(v<=na/2){
						v=v*2;
					}
					v=na-v;
					v=(v*2)+1;
					System.out.println("winner:"+v);
			}
			}