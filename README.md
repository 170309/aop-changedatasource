
#本例是一个AOP动态切换数据源的project

    1.关键类：DataSourceManager
            DynamicDataSource
            DynamicDataSourceAspect
            DataSource
            
 ###
    2.关键配置：
            a) 配置多数据源
            <bean name="db1" class="com.alibaba.druid.pool.DruidDataSource">
                    <property name="driverClassName" value="${db.driverClassName}"/>
                    <property name="url" value="${db.url}"/>
                    <property name="username" value="${db.username}"/>
                    <property name="password" value="${db.password}"/>
            </bean>
            
            <bean name="db2" class="com.alibaba.druid.pool.DruidDataSource">
                <property name="driverClassName" value="${db.driverClassName}"/>
                <property name="url" value="${db.url2}"/>
                <property name="username" value="${db.username}"/>
                <property name="password" value="${db.password}"/>
            </bean>
            
            b) 配置一个统一的切换数据源的bean 以ID做标记
            
            <bean id="dynamicDatasource" class="org.demo.util.changedatasource.DynamicDataSource">
                <property name="defaultTargetDataSource" ref="db1"/>
                <property name="targetDataSources">
                    <map key-type="java.lang.String">
                        <entry key="db1" value-ref="db1"/>
                        <entry key="db2" value-ref="db2"/>
                    </map>
                </property>
            </bean>
            //DynamicDataSource 切换源的关键
            c) AOP 动态的切源
 ###          
            