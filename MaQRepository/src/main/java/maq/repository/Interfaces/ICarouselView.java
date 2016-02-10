/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.Interfaces;

import java.util.ArrayList;
import maq.repository.App.App;

/**
 *
 * @author MaQ
 */
public interface ICarouselView {
     public ArrayList<App> getApps();
      public App getSelectedApp();
}
