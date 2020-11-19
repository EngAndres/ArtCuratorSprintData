/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artcuratorDAOs;

import entities.ArtPiece;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author casierrav
 */
public interface ArtPieceDAO {
    
   public void setDataSource(DataSource ds);
   
   public void create(String name, Integer age);
   
   public ArtPiece getStudent(Integer id);
   
   public List<ArtPiece> listArtPieces();
   
   public void delete(Integer id);
   
   public void update(Integer id, Integer age);
    
}
