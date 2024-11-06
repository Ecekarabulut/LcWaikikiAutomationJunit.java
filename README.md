<div align="center">
 LCWaikikiWebTestProject
</div>

# **Selenium WEB** //Intelij //MVN//JUNIT//TESTNG 
# AllSteps LCWaikiki WithLogin Scenario 
**Tags:chrome**

1. [+] **https://www.lcwaikiki.com/tr-TR/TR sitesi açılır.**

2. [+] **Çerezler Kabul Edilir.**

3. [+] **Ana sayfanın açıldığı kontrol edilir. Siteye login olunur.**

4. [+] **Login işlemi kontrol edilir.**

5. [+] **Arama kutucuğuna “Parfüm” kelimesi girilir.**

6. [+] **Sayfanın sonuna scroll edilir.**

7. [+] **“Daha fazla ürün gör “ butonuna tıklanır.**

8. [+] **Sonuca göre sergilenen ürünlerden bir ürün seçilir.**

9. [+] **Seçilen ürün sepete eklenir.**

10. [+] **Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.**

11. [+] **Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.**

12. [+] **Ürün sepetten silinerek ve favorilere eklenerin sepetin boş olduğu kontrol edilir.**

# DEMO
https://user-images.githubusercontent.com/89300182/200200810-22f77578-b6d7-46d6-8469-35fbf86069f6.mp4



# TODO

1. [-] **Log**

2. [-] **Open Closed Princible.**

3. [-] **Console Red Info Closed.**


# POMXML
 
 <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>LcWaikikiTest</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.0.3</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.0</version>
        </dependency>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>


 ```






