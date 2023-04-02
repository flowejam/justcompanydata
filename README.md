# justcompanydata

Disclaimer: This should be regarded as a prototype. The information and data included is solely for informational purposes, and should not be used to make investment decisions. This project is in no way affiliated with nor approved by the SEC.

Instructions (*nix): 
1. git clone https://github.com/flowejam/justcompanydata.git
2. cd justcompanydata/project/
3. mvn package
4. java -jar target/project-0.0.1-SNAPSHOT.jar 
5. Open your browser and enter http://localhost:8080/

[Screencast from 04-01-2023 07:06:02 PM.webm](https://user-images.githubusercontent.com/91450942/229327210-1c648e70-eb23-4bda-99a6-002ba0b16356.webm)

\n
Project description: 
This Spring Boot app includes a H2 database containing publicly available information extracted or derived from the SEC's bulk data files (the program used to extract the data is not included here). The links to this bulk data can be found here: https://www.sec.gov/edgar/sec-api-documentation. Thanks to the SEC for making such information publicly available.
