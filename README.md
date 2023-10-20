# ppsr2dcatcs
Aproaching a model-driven solution for improving FAIR qualities of Citizen Science Metadata 

Terms:
- PPSR Core - Public Participation in Scientific Research (https://core.citizenscience.org/) 
- DCAT - Data Catalog Vocabulary (https://www.w3.org/TR/vocab-dcat-2/)
- DCAT-CS - DCAT based profile for Citizen Science

The proposal of this work consists of creating metamodels (for PPSR Core and DCAT-CS) to ensure model-to-model transformations that contribute to the creation of FAIR capabilities in CS community. 
The first phase involves identifying the fundamental entities and attributes of the PPSR Core. Through this analysis, essential concepts are identified to form the metamodel. The relationships between these concepts are defined, together with any constraints and limitations. Based on this analysis, the necessary elements for constructing the metamodel using PPSR Core are identified, marking the transition to the next phase.

After establishing the PPSR Core metamodel, the next step involves examining the specifications of DCAT to identify compatible extension points for designing the DCAT profile for CS. Subsequently, the metamodel corresponding to the DCAT profile is defined. Once both metamodels are in place, the essential code for model-to-model transformations is written.

For running the project you must:
- Prepare or load a JSON File from a PPSR implementation.
- Run the class src/ppsr2dcatlauncher/runner.java (adjust file paths in config.properties file, using relative path)
- The execution will produce a XMI file as instance from de PPSR metamodel, later a XMI file with an instance of DCAT-CS metamodel transformed.

The project is a Java - Maven project, be sure your able to resolve the declared dependencies.

This work is promoted by Web and Knowledge Research Group (WAKE) - University of Alicante - Spain

