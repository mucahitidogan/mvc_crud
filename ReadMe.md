# Company

Öncelikle DBye şirket eklememiz gerekiyor. Ekli olan şirketlere çalışan ekleme işlemini şirketleri ekledikten sonra gerçekleştirebiliriz.


## URL
    http://localhost:8080/api/v1/company

### FIND_ALL
    http://localhost:8080/api/v1/company/find-all
### SAVE
    @RequestBody
    http://localhost:8080/api/v1/company/save
### UPDATE
    @RequestBody
    http://localhost:8080/api/v1/company/update
### DELETE
    http://localhost:8080/api/v1/company/delete

#   Employee
 Employee ekleme işlemini şirketlerin ID'leri üzerinden gerçekleştiriyoruz.
## URL
    http://localhost:8080/api/v1/employee

### FIND_ALL
    http://localhost:8080/api/v1/employee/find-all
### SAVE
    @RequestBody
    http://localhost:8080/api/v1/employee/save
### UPDATE
    @RequestBody
    http://localhost:8080/api/v1/employee/update
### DELETE
    http://localhost:8080/api/v1/employee/delete