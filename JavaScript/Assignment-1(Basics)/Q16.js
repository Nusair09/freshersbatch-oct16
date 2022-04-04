function createTable(){
    row = window.prompt("Input number of rows");
    column = window.prompt("Input number of columns");
      
     for(var r=0;r<parseInt(row,10);r++)
      {
       var x=document.getElementById('table').insertRow(r);
       for(var c=0;c<parseInt(column,10);c++)  
        {
         var y=  x.insertCell(c);
         y.innerHTML="Row-"+r+" Column-"+c; 
        }
       }
    };