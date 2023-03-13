Given five files,

- `StudentController.java`
- `StudentRepository.java`
- `StudentH2Service.java`
- `StudentRowMapper.java`
- `Student.java`

And also given a database file `school` which contains a `student` table. The `student` table initially contains details of 20 students. 

#### Student Table

|   Columns   |  Type   |
| :---------: | :-----: |
|  studentId  | INTEGER |
| studentName |  TEXT   |
|   gender    |  TEXT   |
|  standard   | INTEGER |

<SingleLineNote>

Use only STUDENT as a table name in your code while writing queries.
</SingleLineNote>

### Completion Instructions

- `Student.java`: `Student` class should contain the following attributes.

    |  Attribute  |  Type  |
    | :---------: | :----: |
    |  studentId  |  int   |
    | studentName | String |
    |   gender    | String |
    |  standard   |  int   |

- `StudentRepository.java`: Create an `interface` containing required methods.
- `StudentH2Service.java`: Update the service class with logic for managing student data.
- `StudentController.java`: Create the controller class to handle HTTP requests.
- `StudentRowMapper.java`: Create a class which implements the `Rowmapper Interface`.

Implement the following APIs.

### API 1

#### Path: `/students`

#### Method: `GET`

#### Description:

Returns a list of all students in the school.

#### Response

```
[
    {
        "studentId": 1,
        "studentName": "John",
        "gender": "Male",
        "standard": 1
    },
   ...
]
```

### API 2

#### Path: `/students`

#### Method: `POST`

#### Description:

Creates a new student in the `student` table. The `studentId` is auto-incremented. Also, returns the student details added. 

#### Request

```
{
  "studentName": "Prince",
  "gender": "Male",
  "standard": 4
}
```

#### Response

```
{
    "studentId": 21,
    "studentName": "Prince",
    "gender": "Male",
    "standard": 4
}
```

### API 3

#### Path: `/students/bulk`

#### Method: `POST`

#### Description:

Creates multiple students in the `student` table and returns a text containing the numbers of students added.  

#### Request

For example, the below request object contains details of 4 students.

```
[
    {
        "studentName": "Jack",
        "gender": "Male",
        "standard": 8
    },
    ...
]
```

#### Response

```

Successfully added 4 students
```

<MultiLineQuickTip>

The controller method that handles this API 3 consists of the parameter of type `ArrayList<Student>`.
</MultiLineQuickTip>

### API 4

#### Path: `/students/{studentId}`

#### Method: `GET`

#### Description:

Returns a student based on the `studentId`. If the given `studentId` is not found in the `student` table, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.


#### Success Response

```
{
    "studentId": 13,
    "studentName": "Olivia",
    "gender": "Female",
    "standard": 3
}
```

### API 5

#### Path: `/students/{studentId}`

#### Method: `PUT`

#### Description:

Updates the details of a student in the `student` table based on the `studentId`.  Also, return the updated student details from the `student` table using the `studentId`.


#### Request

```
{
    "studentName": "Yuvi"
    "gender": "Male",
    "standard": 6
}
```

#### Success Response

```
{
    "studentId": 3,
    "studentName": "Yuvi",
    "gender": "Male",
    "standard": 6
}
```

### API 6

#### Path: `/students/{studentId}`

#### Method: `DELETE`

#### Description:

Deletes a student from the `student` table based on the `studentId`. 

**Do not modify the code in `SchoolApplication.java`**