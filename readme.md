## Семинар 5. Другие виды тестирования ##


Задание 1.
*Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты. Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

1. Unit tests
* test_checking_the_contact проверка на создание объекта
* test_add_contact_the_repository проверка на добавление контакта через класс репозиторий,
* test_change_contact_the_repository проверка на изменение контакта, через репозиторий. использование MOСK
* test_delete_contact_the_repository проверка на удаление контакта через репозиторий. использование MOСK
* test_check_service_add_contact проверка серсиса на вызов метода на добавление контакта
* test_check_service_change_contact проверка сервиса на вызов метода на изменение
* test_check_service_delete_contact проверка сервиса на вызов метода на удаление

2. integration tests
* test_check_interaction_contacts_repository проверка на взаимодействие классов репозиторий с контактом Можно использовать fake.
* test_check_interaction_service_repository проверка на взаимодействие классов репозиторий с сервисом Можно использовать fake.
* test_check_interaction_service_repository-contacts проверка на взаимодействие всех классов Можно использовать fake.

3. End-to-end tests
* check_user_interface_add_contact проверка добавление Контакта в систему черещ интерфейс пользователя
* check_user_interface_change_contact проверка редактирования Контакта в систему черещ интерфейс пользователя
* check_user_interface_delete_contact проверка удаления Контакта в систему черещ интерфейс пользователя


Задание 2.
*Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"". ""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"". ""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов

Unit тест. проверка одной функции в одном модуле, у которой одна задача

2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов

End-to-end tests сквозное тестирование т.к мы добавляем контакт через интерфейс пользователя

3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление

integration tests мы можем провести тесты как отдельного модуля, так и их взаимодействие между собой