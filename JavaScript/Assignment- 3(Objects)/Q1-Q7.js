//Q1
class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
    }
    //Q2 
    getArea = () => { return this.width * this.height; };
    getPerimeter = () => { return 2 * (this.width + this.height); };
  }
  r = new Rectangle(2, 3);
  document.write(`Rectangle r width is ${r.width}, length is ${r.height} `);
  document.write(`rectangle r of length ${r.length} & width  ${r.width} has area ${r.getArea()} and perimeter ${r.getPerimeter()}`);
  
  //Q3 
  s = new Rectangle(4,10);
  document.write(` New rectangle s of length ${s.length} & width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
  s.width = 5;
  document.write(`rectangle s of length ${s.length} & Changed width  ${s.width} has area ${s.getArea()} and perimeter ${s.getPerimeter()}`);
  
  //Q4 
  var myObject = {firstname: "Nusair",lastname: "Basha",age: "21",city: "Palamaner",state: "Andhra Pradesh",country: "India"};
  document.write(` First-name is ${myObject.firstname} , lastname  is ${myObject.lastname} , age is ${myObject.age} , city is ${myObject.city} , state is ${myObject.state} , country is ${myObject.country}`);
  myObject.lastname = "Singh";
  document.write(`Changed Lastname ${myObject.lastname}`);
  //Q5 
  document.write(`since there is no middle name defined The middle name is : ${myObject.MiddleName}`);
  myObject.MiddleName = "BashaBoi";
  document.write(`After defining The middle name is : ${myObject.MiddleName}`);
  
  //Q6 
  var string = "{firstName:'Sindhura', age:21, city:'Chennai', state:'Tamil Nadu', country:'India'}";
  eval('var obj='+string);
  document.write(obj);
  myObject.MiddleName = "Reddy";
  document.write(` The middle name is : ${myObject.MiddleName}`);
  
  //Q7 
  var obj = '{ "firstName":"Nusair", "lastName":"Basha" }';
  obj = JSON.parse(obj); //converts to a regular object
  document.write(obj); 