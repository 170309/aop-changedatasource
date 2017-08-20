package org.demo.util.changedatasource;

public class DataSourceManager {

    public static final String DATASOURCE_DB1 = "db1";
    public static final String DATASOURCE_DB2 = "db2";

    private static ThreadLocal<String> dbTypes = new ThreadLocal<>();

    public static String get(){
        String db = dbTypes.get();
        if(db == null){
            db = DATASOURCE_DB2;
        }
        return db;
    }

    public static void set(String dbType){
        dbTypes.set(dbType);
    }

    public static void remove(){
        dbTypes.remove();
    }
}
