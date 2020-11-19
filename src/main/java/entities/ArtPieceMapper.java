/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author casierrav
 */
public class ArtPieceMapper implements RowMapper<ArtPiece> {
    public ArtPiece mapRow(ResultSet rs, int rowNum) throws SQLException {
      ArtPiece artPiece = new ArtPiece();
      artPiece.setId(rs.getInt("id"));
      artPiece.setName(rs.getString("name"));
      artPiece.setType(rs.getString("type"));
      artPiece.setCost(rs.getInt("cost"));
      artPiece.setExposition_id(rs.getInt("exposition_id"));
      
      
      return artPiece;
   }
}
