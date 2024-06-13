
// var http = require('http');
// var fs = require('fs');

// http.createServer(function (req, res) {
//   fs.readFile('index.html', (err, data) => {

//     res.writeHead(200, {'Content-Type': 'text/html'});
//     res.write(data);
//     res.end();

//   });

// }).listen(3000);
const express = require('express')
const morgan = require('morgan')
const mongoose = require('mongoose')
const handlebars = require('express-handlebars');  
const url = "mongodb+srv://DemoCRUD:abc123456@cluster0.fpneuhf.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"

const app = express()
const port = 3000

app.use(morgan('combined'));
app.use(express.json())

mongoose.connect(url, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
  tlsAllowInvalidCertificates: true  // Bỏ qua các vấn đề SSL
}).then(() => {
  console.log('Connected to MongoDB!');
}).catch((error) => {
  console.error('Error connecting to MongoDB:', error);
});

const studentRouter = require('../routers/userRouter');
app.use(studentRouter)

// app.engine('handlebars',handlebars.engine());
app.engine('hbs',handlebars.engine({extname: '.hbs'}));
app.set('view engine','.hbs');
app.set('views', './src/resources/views')
app.get('/', (req, res) => {
  // res.send('Hello World!')
  res.render('home');
})
app.get('/news', (req, res) => {
  // res.send('Hello World!')
  res.render('news');
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})