# WebsiteOTTN
**Tạo file `application.properties` tại đường dẫn `src/main/resources/`**

<b>Thông tin trong file `application.properties` (Thay thế `???` để chạy chương trình):</b>
```text
spring.application.name=websiteOnThiTracNghiem
spring.datasource.url=jdbc:mysql://localhost:3306/webonthitracnghiem?createDatabaseIfNotExist=true
spring.datasource.username=???
spring.datasource.password=???
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update

spring.servlet.multipart.max-file-size=2GB
spring.servlet.multipart.max-request-size=2GB
```
---
<h5>**Tạo file `storage` tại đường dẫn `src/main/java/com/hutech/websiteOnThiTracNghiem/` để chạy chức năng upload.**
---
---