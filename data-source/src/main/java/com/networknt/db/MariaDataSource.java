/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.db;

import javax.sql.DataSource;

/**
 * Maria DB data source that is a drop-in replacement for Mysql database.
 *
 * @author Steve Hu
 */
public class MariaDataSource implements GenericDataSource
{
    private static final String DS_NAME = "MariaDataSource";
    private static final String DB_PASS_KEY = "mariaPassword";

    private DataSourceHelper _dsh;

    public MariaDataSource() { _dsh = new DataSourceHelper(DS_NAME, DB_PASS_KEY); }
    public MariaDataSource(String dsName) { _dsh = new DataSourceHelper(dsName != null ? dsName : DS_NAME, DB_PASS_KEY); }

    public String getDsName() { return _dsh.getDsName(); }
    public String getDbPassKey() { return _dsh.getDbPassKey(); }
    public DataSource getDataSource() { return _dsh.getDataSource(); }
}
