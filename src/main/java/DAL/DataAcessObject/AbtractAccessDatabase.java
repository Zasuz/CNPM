package DAL.DataAcessObject;

import DAL.DatabaseConnector.ConnectManager;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public abstract class AbtractAccessDatabase<T> {
//    protected BeanListHandler<T> beanListHandler;
//    protected BeanHandler<T> beanHandler;
    protected ResultSetHandler<T> resultSetHandler;
    protected ResultSetHandler<List<T>> resultSetHandlerList;
    protected final QueryRunner queryRunner = new QueryRunner();
    protected final ConnectManager connectManager = new ConnectManager();

    //Simple query for table
    protected T executeQuery(String query, Object... params) {
        getNewConnectionManager();
        try{
            return queryRunner.query(connectManager.getConnection(), query, resultSetHandler, params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    protected boolean executeUpdate(String query, Object... params) {
        getNewConnectionManager();
        try{
            int result = queryRunner.update(connectManager.getConnection(), query, params);
            return checkUpdateSuccess(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return false;
    }

    protected List<T> executeQueryList(String query, Object... params) {
        getNewConnectionManager();
        try{
            return queryRunner.query(connectManager.getConnection(), query, resultSetHandlerList,params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connectManager.closeConnection();
        }
        return null;
    }

    protected void setClazz(Class<T> clazz) {
        this.resultSetHandler = new BeanHandler<>(clazz);
        this.resultSetHandlerList = new BeanListHandler<>(clazz);
    }

    private void getNewConnectionManager(){
        connectManager.openConnection();
    }

    private boolean checkUpdateSuccess(int result){
        return result > 0;
    }

}
