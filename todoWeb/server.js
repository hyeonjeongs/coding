const express = require('express'); //express 라이브러리를 참고
const app= express(); // express에 대한 객체 만들기

app.listen(8080, function(){
    console.log('listening on 8080')
});

//get 요청
app.get('/pet', function(req, res){
    res.send('펫용품 쇼핑할 수 있는 페이지')
});

//get 요청함
app.get('/', function(req, res){ 
    res.sendFile(__dirname + '/index.html')
});