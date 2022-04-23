package DAL.DataAcessObject;

import java.util.List;

//Interface dùng cho các bản ghi có trong database
public interface ISimpleAccess<T, Id> {
    //Insert datatype T into database by common SQL command: INSERT INTO
    boolean insert(T t);

    //Delete rows has primary key equals to id (or maybe we change property of IS_DELETED to true)
    boolean delete(Id id);

    //Update row has id by t properties
    boolean update(Id id, T t);

    //Get row has id: SELECT * FROM table WHERE id = id
    T select(Id id);

    //Get all rows in the table: SELECT * FROM table
    List<T> selectAll();
}