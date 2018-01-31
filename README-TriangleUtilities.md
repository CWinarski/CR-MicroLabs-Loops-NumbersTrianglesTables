# TriangleUtilities
## `String getRow(int width)`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a row of asterisks whose length is equal to the `width` specified.
    
### Example
* Sample Script

    ```
    // : Given
    int width = 10;
    
    // : When
    String outcome = Triangles.getRow(width);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    **********
    ```
    
    
    
    
    
    








<br><br><br><br>
## `String getSmallTriangle()`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a small triangle, whose base height and base width is 4 asterisks.
    
### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getSmallTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    
    ```
    
    
    
    
    
    

<br><br><br><br>
## `String getLargeTriangle()`
* **Description**
    * Write a method that returns a `String` representation of a large triangle, whose base height and base width is 10 asterisks.
    
### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getLargeTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    
    ```







<br><br><br><br>
## `String getTriangle(int n)`
* **Description**
    * Given one integer, `n`, generate a `String` representation of a triangle whose base height and width is equal to `n`.

	
### Example
* Sample Script

    ```
    // : Given
    int numberOfRows = 15;
    
    // : When
    String outcome = Triangles.createTriangle(numberOfRows);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
    ***********
    ************
    *************
    **************
    
    ```