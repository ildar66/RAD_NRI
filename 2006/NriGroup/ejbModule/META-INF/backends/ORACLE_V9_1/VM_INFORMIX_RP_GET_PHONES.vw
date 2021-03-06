<?xml version="1.0"?>

<View name="RP_GET_PHONES">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:45 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.RP_GET_PHONES
  (BAN,
   PHONENUMBER,
   PHONESTATUS,
   NETSTANDART,
   BEN,
   SOC,
   SOCDESCRIPTION)
  AS SELECT 
   x0.BAN, 
   x1.PHONENUMBER, 
   x1.PHONESTATUS, 
   x1.NETSTANDARD, 
   x1.BEN, 
   x1.SOC, 
   x1.SOCDESCRIPTION
FROM
   INFORMIX.LEASEABONENTBAN x0, INFORMIX.LEASEABONENTPHONES x1
WHERE
   x0.LEASEDOCUMENT = x1.LEASEDOCUMENT ;
]]>
</View>
