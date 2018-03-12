package emailsystem;

import java.util.Map;

import org.mule.api.MuleMessage;

public class storeReturn {
	
	
    
// 	var vm = this;
//   vm.currentToName;
//   vm.currentFromName;  
//   vm.currentSubject;   
//   vm.currentBody; 
//   vm.currentDate; 
//   vm.currentEmailId;
//   vm.currentNewOld;
//   
   public void recieveMessage(MuleMessage m)
	{
        
         
        
        String data= (String) m.getPayload();
        	String first = data.split(",")[0];
        	String second = data.split(",")[1];
        	String third = data.split(",")[2];
    		String fourth = data.split(",")[3];
    		String fifth = data.split(",")[4];
        	String sixth = data.split(",")[5];
    		String seventh = data.split(",")[6];  
    		
    			//String firstName = "gotStuff";
    			
    			String firstName = first.split("=")[1];
    			System.out.println(firstName);
         
        	 
//         	$log.log("inputs being added");
//         	vm.currentToName = document.getElementById('accountFname').value;
//  	 		vm.currentFromName = document.getElementById('accountSname').value;
//   			vm.currentSubject = document.getElementById('accountNum').value;
//   			vm.currentBody = document.getElementById('accountNum').value;
//   			vm.currentDate = document.getElementById('accountNum').value;
//   			vm.currentEmailId = document.getElementById('accountNum').value;
//   			vm.currentNewOld = document.getElementById('accountNum').value;
//   			
   			
   			
//   			$log.log(vm.currentAccountN);
//   			
//   			vm.herro = {firstName: vm.currentFirstN,
//        				secondName: vm.currentSecondN,
//        				accountNumber: vm.currentAccountN};
   			
         
         }
         
    

}

