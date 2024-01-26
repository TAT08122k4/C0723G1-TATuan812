import '../styles/Ss3Student.css'
const students = [
    {
        id: 1,
          name: 'Alfreds Futterkiste',
          age: 'Maria Anders',
          address: 'Germany'
        },
        {
          id: 2,
          name: 'Centro comercial Moctezuma',
          age: 'Francisco Chang',
          address: 'Mexico'
        },
        {
          id: 3,
          name: 'Ernst Handel',
          age: 'Roland Mendel',
          address: 'Austria'
        },
        {
          id: 4,
          name: 'Island Trading',
          age: 'Helen Bennett',
          address: 'UK'
        },
        {
          id: 5,
          name: 'Laughing Bacchus Winecellars',
          age: 'Yoshi Tannamuri',
          address: 'Canada'
        },
        {
          id: 6,
          name: 'Magazzini Alimentari Riuniti',
          age: 'Giovanni Rovelli',
          address: 'Italy'
        }
]
export function ListStudent(){
    return (
<>
   {students.map((student) => (
    <tr key={student.id}>
        <td>{student.id}</td>
        <td> {student.name}</td>
        <td>{student.age}</td>
        <td>{student.address}</td>
    </tr>
   ))}
</>
    );
}

