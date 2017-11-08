package org.apache.spark.sql

/**
  * Created by zy on 2017/8/3.
  */

trait mixinterface {

  def analysisSql(sqltext: String , ss: SparkSession) : Unit

}
