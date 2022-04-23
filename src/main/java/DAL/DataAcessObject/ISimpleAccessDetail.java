package DAL.DataAcessObject;

import java.util.List;

//This table for access data of detail table
//Interface dùng cho các bản chi tiết ...
public interface ISimpleAccessDetail<T, Id1, Id2>{
    T select(Id1 id1, Id2 id2);
    boolean insert(T t);
    boolean update(Id1 id1, Id2 id2, T t);
    boolean delete(Id1 id1, Id2 id2);
    List<T> selectAllById1(Id1 id1);
    List<T> selectAllById2(Id1 id2);
    List<T> selectAll();
}
