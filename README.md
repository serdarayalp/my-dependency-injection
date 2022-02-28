# Dependency
Ein Objekt benötigt normalerweise Objekte anderer Klassen, um seine Operationen auszuführen. 
Wir nennen diese Objekte Abhängigkeiten (Dependencies). 

# Injection
Injection umfasst den Prozess der Bereitstellung  der erforderlichen Abhängigkeiten für ein Objekt. 

# Inversion of Control
Dependency Injection (DI) unterstützt bei der Implementierung von Inversion of Control (loC, Umkehrung der Steuerung). 
Dies bedeutet, dass die Verantwortung für die Objekterstellung und das Einfügen der Abhängigkeiten nicht durch die 
Klasse selbst bereitgestellt wird, sondern durch einen externen Service oder durch ein Framework, z.B. Spring.

**Es gibt drei gängige Arten von Dependency Injection**
* **Constructor Injection**: Bei der Constructor Injection wird die Abhängigkeit als Parameter/Argument im Konstruktor der betrachteten Klasse übergeben. Daher können wir keine neue Instanz der betrachteten Klasse erstellen, ohne eine Variable des vom Konstruktor benötigten Typs zu übergeben. 
* **Setter Injection (Property Injection)**: Sie beschreibt die Art der Injection, bei der Abhängigkeiten über vorgesehene Setter-Methoden injiziert/eingefügt werden, nachdem ein Objekt einer Klasse (der Abhängigkeit) instanziiert wurde. 
* **Method Injection (Interface Injection)**: Im Falle der Method-Injection erfolgt die Injektion durch die Implementierung eines Interfaces, das Methoden zum Setzen der Abhängigkeiten bereitstellt. 

