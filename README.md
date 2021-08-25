# SpringBoot_dbCRUD_REST

В этом примере реализована базовая работа с БД в REST архитектуре. Такая работа подходит для микросервисных архитектур.

Пример использования:
1. Для добавления записи в БД, нужно отправить POST запрос? пр: http://localhost:8080/user/add?name=Name&email=email@gmail.com
2. В ответе придет добавленная запись в JSON формате. 
пр: 
{
    "id": 1,
    "name": "Name",
    "email": "email@gmail.com"
}