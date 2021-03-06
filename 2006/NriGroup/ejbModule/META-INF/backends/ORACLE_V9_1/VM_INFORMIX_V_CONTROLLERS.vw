<?xml version="1.0"?>

<View name="V_CONTROLLERS">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:46 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.V_CONTROLLERS
  (STORAGEPLACE,
   EQUIPMENT)
  AS SELECT 
   x0.STORAGEPLACE, 
   x3.EQUIPMENT
FROM
   INFORMIX.CONTROLLERS x3, INFORMIX.EQUIPMENT x2, INFORMIX.POSITIONS x0, INFORMIX.STORAGEPLACES x1
WHERE
   x3.EQUIPMENT = x2.EQUIPMENT 
   AND x1.STORAGEPLACE = x0.STORAGEPLACE  
   AND x0.STORAGEPLACE = x2.POSITION ;
]]>
</View>
