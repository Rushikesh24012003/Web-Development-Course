//Database connectivity code
const submit = document.querySelector('#submit');




const savelead = async () =>{
    let clientName = document.getElementById("recipient-name").value
    let mobile = document.getElementById("mobile").value
    let email = document.getElementById("email").value
   
   
   
    //GET the data on console
    let response = await fetch('http://localhost:8090/lead/getLeads');
    //POST the data to our database
    let response2 = await fetch('http://localhost:8090/lead/save',{
        method : 'POST' ,
        headers : {
            'Accept' : 'application/json',
            'Content-Type' : 'application/json'
        },
        body : JSON.stringify({
            name : clientName,
            email: email,
            mobile: mobile
        })
    });
    console.log(response)
   console.log(response2)
   //to clear the form
   document.getElementById("myForm").reset();
}


submit.addEventListener('click',savelead);