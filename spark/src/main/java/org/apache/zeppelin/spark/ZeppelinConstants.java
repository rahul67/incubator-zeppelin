package org.apache.zeppelin.spark;

public interface ZeppelinConstants {

  String ARG_ZEPPELIN_DEP_LOCAL_REPO_KEY = "zeppelin.dep.localrepo";
  String ARG_ZEPPELIN_DEP_LOCAL_REPO_VALUE = "local-repo";
  String ARG_ZEPPELIN_DEP_LOCAL_REPO_DESC = "local repository for dependency loader";
  
  String ENV_ZEPPELIN_HOME_KEY = "ZEPPELIN_HOME";
  String ARG_ZEPPELIN_HOME_KEY = "zeppelin.home";
  
  String ENV_SPARK_HOME_KEY = "SPARK_HOME";
  String ARG_SPARK_HOME_KEY = "spark.home";
  String ARG_SPARK_HOME_VALUE = "";
  String ARG_SPARK_HOME_DESC = "Spark home path. Should be provided for pyspark";
  
  String ENV_PYSPARK_PYTHON_KEY = "PYSPARK_PYTHON";
  String ARG_ZEPPELIN_PYSPARK_PYTHON_KEY = "zeppelin.pyspark.python";
  String ARG_ZEPPELIN_PYSPARK_PYTHON_VALUE = "python";
  String ARG_ZEPPELIN_PYSPARK_PYTHON_DESC = "Python command to run pyspark with";
  
  String ENV_PYTHONPATH_KEY = "PYTHONPATH";
  
  String ENV_JAVA_TMP_DIR = "java.io.tmpdir";
  
  String DEFAULT_ZEPPELIN_PYSPARK_EXE = "/zeppelin_pyspark.py";
  
  String PY4J_SRC_ZIP_PATH = "/python/lib/py4j-0.8.2.1-src.zip";
  
  String ARG_SPARK_APP_NAME_KEY = "spark.app.name";
  String ARG_SPARK_APP_NAME_VALUE = "Zeppelin";
  String ARG_SPARK_APP_NAME_DESC = "The name of spark application.";
  
  String ENV_ZEPPELIN_SPARK_MASTER_KEY = "MASTER";
  String ARG_ZEPPELIN_SPARK_MASTER_KEY = "master";
  String ARG_SPARK_MASTER_KEY = "spark.master";
  String ARG_SPARK_MASTER_VALUE = "local[*]";
  String ARG_SPARK_MASTER_DESC = "Spark master uri. ex) spark://masterhost:7077";
  
  String ARG_SPARK_EXECUTOR_MEMORY_KEY = "spark.executor.memory";
  String ARG_SPARK_EXECUTOR_MEMORY_VALUE = "512m";
  String ARG_SPARK_EXECUTOR_MEMORY_DESC = "Executor memory per worker instance. ex) 512m, 32g";

  String ARG_SPARK_CORES_MAX_KEY = "spark.cores.max";
  String ARG_SPARK_CORES_MAX_VALUE = "";
  String ARG_SPARK_CORES_MAX_DESC = "Total number of cores to use. Empty value uses all available core.";
  
  String ENV_SPARK_YARN_JAR_KEY = "SPARK_YARN_JAR";
  String ARG_SPARK_YARN_JAR_KEY = "spark.yarn.jar";
  String ARG_SPARK_YARN_JAR_VALUE = "";
  String ARG_SPARK_YARN_JAR_DESC = "The location of the Spark jar file. If you use yarn as a cluster, we should set this value";
  
  String ARG_ZEPPELIN_SPARK_USEHIVECONTEXT_KEY = "zeppelin.spark.useHiveContext";
  String ARG_ZEPPELIN_SPARK_USEHIVECONTEXT_VALUE = "true";
  String ARG_ZEPPELIN_SPARK_USEHIVECONTEXT_DESC = "Use HiveContext instead of SQLContext if it is true.";
  
  String ARG_ZEPPELIN_SPARK_MAXRESULT_KEY = "zeppelin.spark.maxResult";
  String ARG_ZEPPELIN_SPARK_MAXRESULT_VALUE = "1000";
  String ARG_ZEPPELIN_SPARK_MAXRESULT_DESC = "Max number of SparkSQL result to display.";
  
  String CMD_ARGS_KEY = "args";
  String CMD_ARGS_VALUE = "";
  String CMD_ARGS_DESC = "spark commandline args";
  
  String CLASS_HIVECONTEXT = "org.apache.spark.sql.hive.HiveContext";
  String CLASS_SPARK_DATAFRAME = "org.apache.spark.sql.DataFrame";
  String CLASS_SPARK_SCHEMARDD = "org.apache.spark.sql.SchemaRDD";
  
  String ENV_SPARK_EXECUTOR_URI_KEY = "SPARK_EXECUTOR_URI";
  String ARG_SPARK_EXECUTOR_URI_KEY = "spark.executor.uri";
  
  String ARG_SPARK_REPL_CLASS_URI_KEY = "spark.repl.class.uri";
  
  String ARG_SPARK_SCHEDULER_MODE_KEY = "spark.scheduler.mode";
  String ARG_SPARK_SCHEDULER_MODE_VALUE = "FAIR";
  
  String ARG_ZEPPELIN_SPARK_CONCSQL_KEY = "zeppelin.spark.concurrentSQL";
  String ARG_ZEPPELIN_SPARK_CONCSQL_VALUE = "false";
  String ARG_ZEPPELIN_SPARK_CONCSQL_DESC = "Execute multiple SQL concurrently if set true.";
  
  String ARG_SPARK_SCHEDULER_POOL_KEY = "spark.scheduler.pool";
  String ARG_SPARK_SCHEDULER_POOL_VALUE = "fair";
  
}
