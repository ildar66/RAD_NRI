<?xml version="1.0"?>

<View name="V_EQUIP_DATALOAD1">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:46 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.V_EQUIP_DATALOAD1
  (PLMN,
   GSMID,
   POSNUMBER,
   NAMEPOS,
   BTSGENERATION,
   DATAHEADID,
   DATALOADID,
   FILENAME,
   BSCID,
   GSMID_1,
   BSCUSERLABEL,
   BTSUSERLABEL,
   NETID,
   CYPHER,
   LOCATION,
   NETELEMENT,
   LOADTIME,
   FIRSTCOMMDATE)
  AS SELECT DISTINCT 
   x3.PLMN, 
   x1.GSMID, 
   
   (
      SELECT 
         x4.GSMID
      FROM
         INFORMIX.POSITIONS x4, INFORMIX.STORAGEPLACES x5
      WHERE
         x4.STORAGEPLACE = x5.STORAGEPLACE  
         AND x4.POSSTATE = 'E'  
         AND x4.GSMID = DECODE(1, DECODE(greatest(x1.GSMID, 2000), x1.GSMID, 0, 1), (x1.GSMID - 1000), x1.GSMID) 
   ), 
   
   (
      SELECT 
         x7.NAME
      FROM
         INFORMIX.POSITIONS x6, INFORMIX.STORAGEPLACES x7
      WHERE
         x6.STORAGEPLACE = x7.STORAGEPLACE  
         AND x6.POSSTATE = 'E'  
         AND x6.GSMID = DECODE(1, DECODE(greatest(x1.GSMID, 2000), x1.GSMID, 0, 1), (x1.GSMID - 1000), x1.GSMID) 
   ), 
   x0.BTSGENERATION, 
   x2.DATAHEADID, 
   x2.DATALOADID, 
   x2.FILENAME, 
   x2.BSCID, 
   x2.GSMID, 
   x2.BSCUSERLABEL, 
   x2.BTSUSERLABEL, 
   x2.NETID, 
   x2.CYPHER, 
   x2.LOCATION, 
   x2.NETELEMENT, 
   x2.LOADTIME, 
   x2.FIRSTCOMMDATE
FROM
   INFORMIX.ALCATELSECTOR x1, INFORMIX.ALCATELBTS x0, INFORMIX.ALCATELEQUIPDATAHEADER x2, INFORMIX.EQUIPMENTDATALOADS x3
WHERE
   x1.DATALOADID = x0.DATALOADID 
   AND x0.OMCR = x1.OMCR  
   AND x0.BSMID = x1.BSMID  
   AND x2.BSCUSERLABEL = x0.BSCUSERLABEL  
   AND x2.BTSUSERLABEL = x0.BTSLABEL  
   AND x0.DATALOADID = 
   (
      SELECT 
         x8.DATALOADID
      FROM
         INFORMIX.EQUIPMENTDATALOADS x8
      WHERE
         x8.PLMN = 1  
         AND x8.DATALOADDATE = 
         (
            SELECT 
               max(x9.DATALOADDATE)
            FROM
               INFORMIX.EQUIPMENTDATALOADS x9
            WHERE
               x9.PLMN = 1 
         ) 
   )  
   OR x0.DATALOADID = 
   (
      SELECT 
         x10.DATALOADID
      FROM
         INFORMIX.EQUIPMENTDATALOADS x10
      WHERE
         x10.PLMN = 9  
         AND x10.DATALOADDATE = 
         (
            SELECT 
               max(x11.DATALOADDATE)
            FROM
               INFORMIX.EQUIPMENTDATALOADS x11
            WHERE
               x11.PLMN = 9 
         ) 
   )  
   AND x2.DATALOADID = x0.DATALOADID ;
]]>
</View>