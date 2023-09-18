# Company

Employee eklenmeden önce company eklenmesi gerekmektedir. Company'ler eklenmeli sonrasında sistem Employee eklemeye izin verir.
İlgili company ID kaydı yoksa employee'ler sisteme eklenmez. Sistem hata fırlatır.


## URL
    http://localhost:9090/api/v1/company

### FIND_ALL
    http://localhost:9090/api/v1/company/find-all
### SAVE
    @RequestBody
    http://localhost:9090/api/v1/company/save
### UPDATE
    @RequestBody
    http://localhost:9090/api/v1/company/update
### DELETE
    http://localhost:9090/api/v1/company/delete

#   Employee

İlgili şirketin ID'si mevcut şirketler arasında bulunuyorsa eğer employee eklemesi yapılabilir.

## URL
    http://localhost:9090/api/v1/employee

### FIND_ALL
    http://localhost:9090/api/v1/employee/find-all
### SAVE
    @RequestBody
    http://localhost:9090/api/v1/employee/save
### UPDATE
    @RequestBody
    http://localhost:9090/api/v1/employee/update
### DELETE
    http://localhost:9090/api/v1/employee/delete