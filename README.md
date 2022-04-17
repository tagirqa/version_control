REST Controller для записи версии сборки, которую установили на стенд. При запуске тестов по можно вытащить версию сборки и добавить в отчет. 

POST http://localhost:8080/version/{version}
где version номер сборки

GET http://localhost:8080/version
в теле возвращается номер сборки
