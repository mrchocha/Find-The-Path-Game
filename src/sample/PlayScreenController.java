package sample;

import com.jfoenix.controls.JFXButton;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class PlayScreenController {
    @FXML
    private Button V1;

    @FXML
    private Button V2;

    @FXML
    private Button V3;

    @FXML
    private Button V4;

    @FXML
    private Button V5;

    @FXML
    private Button V6;

    @FXML
    private Button V7;

    @FXML
    private Button V8;

    @FXML
    private Button V9;

    @FXML
    private Button V10;

    @FXML
    private Button V11;

    @FXML
    private Button V12;

    @FXML
    private Button V13;

    @FXML
    private Button V14;

    @FXML
    private Button V15;

    @FXML
    private Button V16;

    @FXML
    private Button V17;

    @FXML
    private Button V18;

    @FXML
    private Button V19;

    @FXML
    private Button V20;

    @FXML
    private Button V21;

    @FXML
    private Button V22;

    @FXML
    private Button V23;

    @FXML
    private Button V24;

    @FXML
    private Button V25;

    @FXML
    private Button V26;

    @FXML
    private Button V27;

    @FXML
    private Button V28;

    @FXML
    private Button V29;

    @FXML
    private Button V30;

    @FXML
    private Button V31;

    @FXML
    private Button V32;

    @FXML
    private Button V33;

    @FXML
    private Button V34;

    @FXML
    private Button V35;

    @FXML
    private Button V36;

    @FXML
    private Button V37;

    @FXML
    private Button V38;

    @FXML
    private Button V39;

    @FXML
    private Button V40;

    @FXML
    private Button V41;

    @FXML
    private Button V42;

    @FXML
    private Button V43;

    @FXML
    private Button V44;

    @FXML
    private Button V45;

    @FXML
    private Button V46;

    @FXML
    private Button V47;

    @FXML
    private Button V48;

    @FXML
    private Button V49;

    @FXML
    private Button V50;

    @FXML
    private Button V51;

    @FXML
    private Button V52;

    @FXML
    private Button V53;

    @FXML
    private Button V54;

    @FXML
    private Button V55;

    @FXML
    private Button V56;

    @FXML
    private Button V57;

    @FXML
    private Button V58;

    @FXML
    private Button V59;

    @FXML
    private Button V60;

    @FXML
    private Button V61;

    @FXML
    private Button V62;

    @FXML
    private Button V63;

    @FXML
    private Button V64;

    @FXML
    private Button V65;

    @FXML
    private Button V66;

    @FXML
    private Button V67;

    @FXML
    private Button V68;

    @FXML
    private Button V69;

    @FXML
    private Button V70;

    @FXML
    private Button V71;

    @FXML
    private Button V72;

    @FXML
    private Button V73;

    @FXML
    private Button V74;

    @FXML
    private Button V75;

    @FXML
    private Button V76;

    @FXML
    private Button V77;

    @FXML
    private Button V78;

    @FXML
    private Button V79;

    @FXML
    private Button V80;

    @FXML
    private Button V81;

    @FXML
    private Button V82;

    @FXML
    private Button V83;

    @FXML
    private Button V84;

    @FXML
    private Button V85;

    @FXML
    private Button V86;

    @FXML
    private Button V87;

    @FXML
    private Button V88;

    @FXML
    private Button V89;

    @FXML
    private Button V90;

    @FXML
    private Button V91;

    @FXML
    private Button V92;

    @FXML
    private Button V93;

    @FXML
    private Button V94;

    @FXML
    private Button V95;

    @FXML
    private Button V96;

    @FXML
    private Button V97;

    @FXML
    private Button V98;

    @FXML
    private Button V99;

    @FXML
    private Button V100;

    @FXML
    private Button V101;

    @FXML
    private Button V102;

    @FXML
    private Button V103;

    @FXML
    private Button V104;

    @FXML
    private Button V105;

    @FXML
    private Button V106;

    @FXML
    private Button V107;

    @FXML
    private Button V108;

    @FXML
    private Button V109;

    @FXML
    private Button V110;

    @FXML
    private Button V111;

    @FXML
    private Button V112;

    @FXML
    private Button V113;

    @FXML
    private Button V114;

    @FXML
    private Button V115;

    @FXML
    private Button V116;

    @FXML
    private Button V117;

    @FXML
    private Button V118;

    @FXML
    private Button V119;

    @FXML
    private Button V120;

    @FXML
    private Button V121;

    @FXML
    private Button V122;

    @FXML
    private Button V123;

    @FXML
    private Button V124;

    @FXML
    private Button V125;

    @FXML
    private Button V126;

    @FXML
    private Button V127;

    @FXML
    private Button V128;

    @FXML
    private Button V129;

    @FXML
    private Button V130;

    @FXML
    private Button V131;

    @FXML
    private Button V132;

    @FXML
    private Button V133;

    @FXML
    private Button V134;

    @FXML
    private Button V135;

    @FXML
    private Button V136;

    @FXML
    private Button V137;

    @FXML
    private Button V138;

    @FXML
    private Button V139;

    @FXML
    private Button V140;

    @FXML
    private Button V141;

    @FXML
    private Button V142;

    @FXML
    private Button V143;

    @FXML
    private Button V144;

    @FXML
    private Button V145;

    @FXML
    private Button V146;

    @FXML
    private Button V147;

    @FXML
    private Button V148;

    @FXML
    private Button V149;

    @FXML
    private Button V150;

    @FXML
    private Button V151;

    @FXML
    private Button V152;

    @FXML
    private Button V153;

    @FXML
    private Button V154;

    @FXML
    private Button V155;

    @FXML
    private Button V156;

    @FXML
    private Button V157;

    @FXML
    private Button V158;

    @FXML
    private Button V159;

    @FXML
    private Button V160;

    @FXML
    private Button V161;

    @FXML
    private Button V162;

    @FXML
    private Button V163;

    @FXML
    private Button V164;

    @FXML
    private Button V165;

    @FXML
    private Button V166;

    @FXML
    private Button V167;

    @FXML
    private Button V168;

    @FXML
    private Button V169;

    @FXML
    private Button V170;

    @FXML
    private Button V171;

    @FXML
    private Button V172;

    @FXML
    private Button V173;

    @FXML
    private Button V174;

    @FXML
    private Button V175;

    @FXML
    private Button V176;

    @FXML
    private Button V177;

    @FXML
    private Button V178;

    @FXML
    private Button V179;

    @FXML
    private Button V180;

    @FXML
    private Button V181;

    @FXML
    private Button V182;

    @FXML
    private Button V183;

    @FXML
    private Button V184;

    @FXML
    private Button V185;

    @FXML
    private Button V186;

    @FXML
    private Button V187;

    @FXML
    private Button V188;

    @FXML
    private Button V189;

    @FXML
    private Button V190;

    @FXML
    private Button V191;

    @FXML
    private Button V192;

    @FXML
    private Button V193;

    @FXML
    private Button V194;

    @FXML
    private Button V195;

    @FXML
    private Button V196;

    @FXML
    private Button V197;

    @FXML
    private Button V198;

    @FXML
    private Button V199;

    @FXML
    private Button V200;

    @FXML
    private Button V201;

    @FXML
    private Button V202;

    @FXML
    private Button V203;

    @FXML
    private Button V204;

    @FXML
    private Button V205;

    @FXML
    private Button V206;

    @FXML
    private Button V207;

    @FXML
    private Button V208;

    @FXML
    private Button V209;

    @FXML
    private Button V210;

    @FXML
    private Button V211;

    @FXML
    private Button V212;

    @FXML
    private Button V213;

    @FXML
    private Button V214;

    @FXML
    private Button V215;

    @FXML
    private Button V216;

    @FXML
    private Button V217;

    @FXML
    private Button V218;

    @FXML
    private Button V219;

    @FXML
    private Button V220;

    @FXML
    private Button V221;

    @FXML
    private Button V222;

    @FXML
    private Button V223;

    @FXML
    private Button V224;

    @FXML
    private Button V225;

    @FXML
    private Button V226;

    @FXML
    private Button V227;

    @FXML
    private Button V228;

    @FXML
    private Button V229;

    @FXML
    private Button V230;

    @FXML
    private Button V231;

    @FXML
    private Button V232;

    @FXML
    private Button V233;

    @FXML
    private Button V234;

    @FXML
    private Button V235;

    @FXML
    private Button V236;

    @FXML
    private Button V237;

    @FXML
    private Button V238;

    @FXML
    private Button V239;

    @FXML
    private Button V240;

    @FXML
    private Button V241;

    @FXML
    private Button V242;

    @FXML
    private Button V243;

    @FXML
    private Button V244;

    @FXML
    private Button V245;

    @FXML
    private Button V246;

    @FXML
    private Button V247;

    @FXML
    private Button V248;

    @FXML
    private Button V249;

    @FXML
    private Button V250;

    @FXML
    private Button V251;

    @FXML
    private Button V252;

    @FXML
    private Button V253;

    @FXML
    private Button V254;

    @FXML
    private Button V255;

    @FXML
    private Button V256;

    @FXML
    private Button V257;

    @FXML
    private Button V258;

    @FXML
    private Button V259;

    @FXML
    private Button V260;

    @FXML
    private Button V261;

    @FXML
    private Button V262;

    @FXML
    private Button V263;

    @FXML
    private Button V264;

    @FXML
    private Button V265;

    @FXML
    private Button V266;

    @FXML
    private Button V267;

    @FXML
    private Button V268;

    @FXML
    private Button V269;

    @FXML
    private Button V270;

    @FXML
    private Button V271;

    @FXML
    private Button V272;

    @FXML
    private Button V273;

    @FXML
    private Button V274;

    @FXML
    private Button V275;

    @FXML
    private Button V276;

    @FXML
    private Button V277;

    @FXML
    private Button V278;

    @FXML
    private Button V279;

    @FXML
    private Button V280;

    @FXML
    private Button V281;

    @FXML
    private Button V282;

    @FXML
    private Button V283;

    @FXML
    private Button V284;

    @FXML
    private Button V285;

    @FXML
    private Button V286;

    @FXML
    private Button V287;

    @FXML
    private Button V288;

    @FXML
    private Button V289;

    @FXML
    private Button V290;

    @FXML
    private Button V291;

    @FXML
    private Button V292;

    @FXML
    private Button V293;

    @FXML
    private Button V294;

    @FXML
    private Button V295;

    @FXML
    private Button V296;

    @FXML
    private Button V297;

    @FXML
    private Button V298;

    @FXML
    private Button V299;

    @FXML
    private Button V300;

    @FXML
    private Button V301;

    @FXML
    private Button V302;

    @FXML
    private Button V303;

    @FXML
    private Button V304;

    @FXML
    private Button V305;

    @FXML
    private Button V306;

    @FXML
    private Button V307;

    @FXML
    private Button V308;

    @FXML
    private Button V309;

    @FXML
    private Button V310;

    @FXML
    private Button V311;

    @FXML
    private Button V312;

    @FXML
    private Button V313;

    @FXML
    private Button V314;

    @FXML
    private Button V315;

    @FXML
    private Button V316;

    @FXML
    private Button V317;

    @FXML
    private Button V318;

    @FXML
    private Button V319;

    @FXML
    private Button V320;

    @FXML
    private Button V321;

    @FXML
    private Button V322;

    @FXML
    private Button V323;

    @FXML
    private Button V324;

    @FXML
    private Button V325;

    @FXML
    private Button V326;

    @FXML
    private Button V327;

    @FXML
    private Button V328;

    @FXML
    private Button V329;

    @FXML
    private Button V330;

    @FXML
    private Button V331;

    @FXML
    private Button V332;

    @FXML
    private Button V333;

    @FXML
    private Button V334;

    @FXML
    private Button V335;

    @FXML
    private Button V336;

    @FXML
    private Button V337;

    @FXML
    private Button V338;

    @FXML
    private Button V339;

    @FXML
    private Button V340;

    @FXML
    private Button V341;

    @FXML
    private Button V342;

    @FXML
    private Button V343;

    @FXML
    private Button V344;

    @FXML
    private Button V345;

    @FXML
    private Button V346;

    @FXML
    private Button V347;

    @FXML
    private Button V348;

    @FXML
    private Button V349;

    @FXML
    private Button V350;

    @FXML
    private Button V351;

    @FXML
    private Button V352;

    @FXML
    private Button V353;

    @FXML
    private Button V354;

    @FXML
    private Button V355;

    @FXML
    private Button V356;

    @FXML
    private Button V357;

    @FXML
    private Button V358;

    @FXML
    private Button V359;

    @FXML
    private Button V360;

    @FXML
    private Button V361;

    @FXML
    private Button V362;

    @FXML
    private Button V363;

    @FXML
    private Button V364;

    @FXML
    private Button V365;

    @FXML
    private Button V366;

    @FXML
    private Button V367;

    @FXML
    private Button V368;

    @FXML
    private Button V369;

    @FXML
    private Button V370;

    @FXML
    private Button V371;

    @FXML
    private Button V372;

    @FXML
    private Button V373;

    @FXML
    private Button V374;

    @FXML
    private Button V375;

    @FXML
    private Button V376;

    @FXML
    private Button V377;

    @FXML
    private Button V378;

    @FXML
    private Button V379;

    @FXML
    private Button V380;

    @FXML
    private Button V381;

    @FXML
    private Button V382;

    @FXML
    private Button V383;

    @FXML
    private Button V384;

    @FXML
    private Button V385;

    @FXML
    private Button V386;

    @FXML
    private Button V387;

    @FXML
    private Button V388;

    @FXML
    private Button V389;

    @FXML
    private Button V390;

    @FXML
    private Button V391;

    @FXML
    private Button V392;

    @FXML
    private Button V393;

    @FXML
    private Button V394;

    @FXML
    private Button V395;

    @FXML
    private Button V396;

    @FXML
    private Button V397;

    @FXML
    private Button V398;

    @FXML
    private Button V399;

    @FXML
    private Button V400;

    @FXML
    private Button V401;

    @FXML
    private Button V402;

    @FXML
    private Button V403;

    @FXML
    private Button V404;

    @FXML
    private Button V405;

    @FXML
    private Button V406;

    @FXML
    private Button V407;

    @FXML
    private Button V408;

    @FXML
    private Button V409;

    @FXML
    private Button V410;

    @FXML
    private Button V411;

    @FXML
    private Button V412;

    @FXML
    private Button V413;

    @FXML
    private Button V414;

    @FXML
    private Button V415;

    @FXML
    private Button V416;

    @FXML
    private Button V417;

    @FXML
    private Button V418;

    @FXML
    private Button V419;

    @FXML
    private Button V420;

    @FXML
    private Button V421;

    @FXML
    private Button V422;

    @FXML
    private Button V423;

    @FXML
    private Button V424;

    @FXML
    private Button V425;

    @FXML
    private Button V426;

    @FXML
    private Button V427;

    @FXML
    private Button V428;

    @FXML
    private Button V429;

    @FXML
    private Button V430;

    @FXML
    private Button V431;

    @FXML
    private Button V432;

    @FXML
    private Button V433;

    @FXML
    private Button V434;

    @FXML
    private Button V435;

    @FXML
    private Button V436;

    @FXML
    private Button V437;

    @FXML
    private Button V438;

    @FXML
    private Button V439;

    @FXML
    private Button V440;

    @FXML
    private Button V441;

    @FXML
    private Button V442;

    @FXML
    private Button V443;

    @FXML
    private Button V444;

    @FXML
    private Button V445;

    @FXML
    private Button V446;

    @FXML
    private Button V447;

    @FXML
    private Button V448;

    @FXML
    private Button V449;

    @FXML
    private Button V450;

    @FXML
    private Button V451;

    @FXML
    private Button V452;

    @FXML
    private Button V453;

    @FXML
    private Button V454;

    @FXML
    private Button V455;

    @FXML
    private Button V456;

    @FXML
    private Button V457;

    @FXML
    private Button V458;

    @FXML
    private Button V459;

    @FXML
    private Button V460;

    @FXML
    private Button V461;

    @FXML
    private Button V462;

    @FXML
    private Button V463;

    @FXML
    private Button V464;

    @FXML
    private Button V465;

    @FXML
    private Button V466;

    @FXML
    private Button V467;

    @FXML
    private Button V468;

    @FXML
    private Button V469;

    @FXML
    private Button V470;

    @FXML
    private Button V471;

    @FXML
    private Button V472;

    @FXML
    private Button V473;

    @FXML
    private Button V474;

    @FXML
    private Button V475;

    @FXML
    private Button V476;

    @FXML
    private Button V477;

    @FXML
    private Button V478;

    @FXML
    private Button V479;

    @FXML
    private Button V480;

    @FXML
    private Button V481;

    @FXML
    private Button V482;

    @FXML
    private Button V483;

    @FXML
    private Button V484;

    @FXML
    private Button V485;

    @FXML
    private Button V486;

    @FXML
    private Button V487;

    @FXML
    private Button V488;

    @FXML
    private Button V489;

    @FXML
    private Button V490;

    @FXML
    private Button V491;

    @FXML
    private Button V492;

    @FXML
    private Button V493;

    @FXML
    private Button V494;

    @FXML
    private Button V495;

    @FXML
    private Button V496;

    @FXML
    private Button V497;

    @FXML
    private Button V498;

    @FXML
    private Button V499;

    @FXML
    private Button V500;

    @FXML
    private Button V501;

    @FXML
    private Button V502;

    @FXML
    private Button V503;

    @FXML
    private Button V504;

    @FXML
    private Button V505;

    @FXML
    private Button V506;

    @FXML
    private Button V507;

    @FXML
    private Button V508;

    @FXML
    private Button V509;

    @FXML
    private Button V510;

    @FXML
    private Button V511;

    @FXML
    private Button V512;

    @FXML
    private Button V513;

    @FXML
    private Button V514;

    @FXML
    private Button V515;

    @FXML
    private Button V516;

    @FXML
    private Button V517;

    @FXML
    private Button V518;

    @FXML
    private Button V519;

    @FXML
    private Button V520;

    @FXML
    private Button V521;

    @FXML
    private Button V522;

    @FXML
    private Button V523;

    @FXML
    private Button V524;

    @FXML
    private Button V525;

    @FXML
    private Button V526;

    @FXML
    private Button V527;

    @FXML
    private Button V528;

    @FXML
    private Button V529;

    @FXML
    private Button V530;

    @FXML
    private Button V531;

    @FXML
    private Button V532;

    @FXML
    private Button V533;

    @FXML
    private Button V534;

    @FXML
    private Button V535;

    @FXML
    private Button V536;

    @FXML
    private Button V537;

    @FXML
    private Button V538;

    @FXML
    private Button V539;

    @FXML
    private Button V540;

    @FXML
    private Button V541;

    @FXML
    private Button V542;

    @FXML
    private Button V543;

    @FXML
    private Button V544;

    @FXML
    private Button V545;

    @FXML
    private Button V546;

    @FXML
    private Button V547;

    @FXML
    private Button V548;

    @FXML
    private Button V549;

    @FXML
    private Button V550;

    @FXML
    private Button V551;

    @FXML
    private Button V552;

    @FXML
    private Button V553;

    @FXML
    private Button V554;

    @FXML
    private Button V555;

    @FXML
    private Button V556;

    @FXML
    private Button V557;

    @FXML
    private Button V558;

    @FXML
    private Button V559;

    @FXML
    private Button V560;

    @FXML
    private Button V561;

    @FXML
    private Button V562;

    @FXML
    private Button V563;

    @FXML
    private Button V564;

    @FXML
    private Button V565;

    @FXML
    private Button V566;

    @FXML
    private Button V567;

    @FXML
    private Button V568;

    @FXML
    private Button V569;

    @FXML
    private Button V570;

    @FXML
    private Button V571;

    @FXML
    private Button V572;

    @FXML
    private Button V573;

    @FXML
    private Button V574;

    @FXML
    private Button V575;

    @FXML
    private Button V576;

    @FXML
    private Button V577;

    @FXML
    private Button V578;

    @FXML
    private Button V579;

    @FXML
    private Button V580;

    @FXML
    private Button V581;

    @FXML
    private Button V582;

    @FXML
    private Button V583;

    @FXML
    private Button V584;

    @FXML
    private Button V585;

    @FXML
    private Button V586;

    @FXML
    private Button V587;

    @FXML
    private Button V588;

    @FXML
    private Button V589;

    @FXML
    private Button V590;

    @FXML
    private Button V591;

    @FXML
    private Button V592;

    @FXML
    private Button V593;

    @FXML
    private Button V594;

    @FXML
    private Button V595;

    @FXML
    private Button V596;

    @FXML
    private Button V597;

    @FXML
    private Button V598;

    @FXML
    private Button V599;

    @FXML
    private Button V600;

    @FXML
    private Button V601;

    @FXML
    private Button V602;

    @FXML
    private Button V603;

    @FXML
    private Button V604;

    @FXML
    private Button V605;

    @FXML
    private Button V606;

    @FXML
    private Button V607;

    @FXML
    private Button V608;

    @FXML
    private Button V609;

    @FXML
    private Button V610;

    @FXML
    private Button V611;

    @FXML
    private Button V612;

    @FXML
    private Button V613;

    @FXML
    private Button V614;

    @FXML
    private Button V615;

    @FXML
    private Button V616;

    @FXML
    private Button V617;

    @FXML
    private Button V618;

    @FXML
    private Button V619;

    @FXML
    private Button V620;

    @FXML
    private Button V621;

    @FXML
    private Button V622;

    @FXML
    private Button V623;

    @FXML
    private Button V624;

    @FXML
    private Button V625;

    @FXML
    private Button V626;

    @FXML
    private Button V627;

    @FXML
    private Button V628;

    @FXML
    private Button V629;

    @FXML
    private Button V630;

    @FXML
    private Button V631;

    @FXML
    private Button V632;

    @FXML
    private Button V633;

    @FXML
    private Button V634;

    @FXML
    private Button V635;

    @FXML
    private Button V636;

    @FXML
    private Button V637;

    @FXML
    private Button V638;

    @FXML
    private Button V639;

    @FXML
    private Button V640;

    @FXML
    private Button V641;

    @FXML
    private Button V642;

    @FXML
    private Button V643;

    @FXML
    private Button V644;

    @FXML
    private Button V645;

    @FXML
    private Button V646;

    @FXML
    private Button V647;

    @FXML
    private Button V648;

    @FXML
    private Button V649;

    @FXML
    private Button V650;

    @FXML
    private Button V651;

    @FXML
    private Button V652;

    @FXML
    private Button V653;

    @FXML
    private Button V654;

    @FXML
    private Button V655;

    @FXML
    private Button V656;

    @FXML
    private Button V657;

    @FXML
    private Button V658;

    @FXML
    private Button V659;

    @FXML
    private Button V660;

    @FXML
    private Button V661;

    @FXML
    private Button V662;

    @FXML
    private Button V663;

    @FXML
    private Button V664;

    @FXML
    private Button V665;

    @FXML
    private Button V666;

    @FXML
    private Button V667;

    @FXML
    private Button V668;

    @FXML
    private Button V669;

    @FXML
    private Button V670;

    @FXML
    private Button V671;

    @FXML
    private Button V672;

    @FXML
    private Button V673;

    @FXML
    private Button V674;

    @FXML
    private Button V675;

    @FXML
    private Button V676;

    @FXML
    private Button V677;

    @FXML
    private Button V678;

    @FXML
    private Button V679;

    @FXML
    private Button V680;

    @FXML
    private Button V681;

    @FXML
    private Button V682;

    @FXML
    private Button V683;

    @FXML
    private Button V684;

    @FXML
    private Button V685;

    @FXML
    private Button V686;

    @FXML
    private Button V687;

    @FXML
    private Button V688;

    @FXML
    private Button V689;

    @FXML
    private Button V690;

    @FXML
    private Button V691;

    @FXML
    private Button V692;

    @FXML
    private Button V693;

    @FXML
    private Button V694;

    @FXML
    private Button V695;

    @FXML
    private Button V696;

    @FXML
    private Button V697;

    @FXML
    private Button V698;

    @FXML
    private Button V699;

    @FXML
    private Button V700;

    @FXML
    private Button V701;

    @FXML
    private Button V702;

    @FXML
    private Button V703;

    @FXML
    private Button V704;

    @FXML
    private Button V705;

    @FXML
    private Button V706;

    @FXML
    private Button V707;

    @FXML
    private Button V708;

    @FXML
    private Button V709;

    @FXML
    private Button V710;

    @FXML
    private Button V711;

    @FXML
    private Button V712;

    @FXML
    private Button V713;

    @FXML
    private Button V714;

    @FXML
    private Button V715;

    @FXML
    private Button V716;

    @FXML
    private Button V717;

    @FXML
    private Button V718;

    @FXML
    private Button V719;

    @FXML
    private Button V720;

    @FXML
    private Button V721;

    @FXML
    private Button V722;

    @FXML
    private Button V723;

    @FXML
    private Button V724;

    @FXML
    private Button V725;

    @FXML
    private Button V726;

    @FXML
    private Button V727;

    @FXML
    private Button V728;

    @FXML
    private Button V729;

    @FXML
    private Button V730;

    @FXML
    private Button V731;

    @FXML
    private Button V732;

    @FXML
    private Button V733;

    @FXML
    private Button V734;

    @FXML
    private Button V735;

    @FXML
    private Button V736;

    @FXML
    private Button V737;

    @FXML
    private Button V738;

    @FXML
    private Button V739;

    @FXML
    private Button V740;

    @FXML
    private Button V741;

    @FXML
    private Button V742;

    @FXML
    private Button V743;

    @FXML
    private Button V744;

    @FXML
    private Button V745;

    @FXML
    private Button V746;

    @FXML
    private Button V747;

    @FXML
    private Button V748;

    @FXML
    private Button V749;

    @FXML
    private Button V750;

    @FXML
    private Button V751;

    @FXML
    private Button V752;

    @FXML
    private Button V753;

    @FXML
    private Button V754;

    @FXML
    private Button V755;

    @FXML
    private Button V756;

    @FXML
    private Button V757;

    @FXML
    private Button V758;

    @FXML
    private Button V759;

    @FXML
    private Button V760;

    @FXML
    private Button V761;

    @FXML
    private Button V762;

    @FXML
    private Button V763;

    @FXML
    private Button V764;

    @FXML
    private Button V765;

    @FXML
    private Button V766;

    @FXML
    private Button V767;

    @FXML
    private Button V768;

    @FXML
    private Button V769;

    @FXML
    private Button V770;

    @FXML
    private Button V771;

    @FXML
    private Button V772;

    @FXML
    private Button V773;

    @FXML
    private Button V774;

    @FXML
    private Button V775;

    @FXML
    private Button V776;

    @FXML
    private Button V777;

    @FXML
    private Button V778;

    @FXML
    private Button V779;

    @FXML
    private Button V780;

    @FXML
    private Button V781;

    @FXML
    private Button V782;

    @FXML
    private Button V783;

    @FXML
    private Button V784;

    @FXML
    private Button V785;

    @FXML
    private Button V786;

    @FXML
    private Button V787;

    @FXML
    private Button V788;

    @FXML
    private Button V789;

    @FXML
    private Button V790;

    @FXML
    private Button V791;

    @FXML
    private Button V792;

    @FXML
    private Button V793;

    @FXML
    private Button V794;

    @FXML
    private Button V795;

    @FXML
    private Button V796;

    @FXML
    private Button V797;

    @FXML
    private Button V798;

    @FXML
    private Button V799;

    @FXML
    private Button V800;

    @FXML
    private Button V801;

    @FXML
    private Button V802;

    @FXML
    private Button V803;

    @FXML
    private Button V804;

    @FXML
    private Button V805;

    @FXML
    private Button V806;

    @FXML
    private Button V807;

    @FXML
    private Button V808;

    @FXML
    private Button V809;

    @FXML
    private Button V810;

    @FXML
    private Button V811;

    @FXML
    private Button V812;

    @FXML
    private Button V813;

    @FXML
    private Button V814;

    @FXML
    private Button V815;

    @FXML
    private Button V816;

    @FXML
    private Button V817;

    @FXML
    private Button V818;

    @FXML
    private Button V819;

    @FXML
    private Button V820;

    @FXML
    private Button V821;

    @FXML
    private Button V822;

    @FXML
    private Button V823;

    @FXML
    private Button V824;

    @FXML
    private Button V825;

    @FXML
    private Button V826;

    @FXML
    private Button V827;

    @FXML
    private Button V828;

    @FXML
    private Button V829;

    @FXML
    private Button V830;

    @FXML
    private Button V831;

    @FXML
    private Button V832;

    @FXML
    private Button V833;

    @FXML
    private Button V834;

    @FXML
    private Button V835;

    @FXML
    private Button V836;

    @FXML
    private Button V837;

    @FXML
    private Button V838;

    @FXML
    private Button V839;

    @FXML
    private Button V840;

    @FXML
    private Button V841;

    @FXML
    private Button V842;

    @FXML
    private Button V843;

    @FXML
    private Button V844;

    @FXML
    private Button V845;

    @FXML
    private Button V846;

    @FXML
    private Button V847;

    @FXML
    private Button V848;

    @FXML
    private Button V849;

    @FXML
    private Button V850;

    @FXML
    private Button V851;

    @FXML
    private Button V852;

    @FXML
    private Button V853;

    @FXML
    private Button V854;

    @FXML
    private Button V855;

    @FXML
    private Button V856;

    @FXML
    private Button V857;

    @FXML
    private Button V858;

    @FXML
    private Button V859;

    @FXML
    private Button V860;

    @FXML
    private Button V861;

    @FXML
    private Button V862;

    @FXML
    private Button V863;

    @FXML
    private Button V864;

    @FXML
    private Button V865;

    @FXML
    private Button V866;

    @FXML
    private Button V867;

    @FXML
    private Button V868;

    @FXML
    private Button V869;

    @FXML
    private Button V870;

    @FXML
    private Button V871;

    @FXML
    private Button V872;

    @FXML
    private Button V873;

    @FXML
    private Button V874;

    @FXML
    private Button V875;

    @FXML
    private Button V876;

    @FXML
    private Button V877;

    @FXML
    private Button V878;

    @FXML
    private Button V879;

    @FXML
    private Button V880;

    @FXML
    private Button V881;

    @FXML
    private Button V882;

    @FXML
    private Button V883;

    @FXML
    private Button V884;

    @FXML
    private Button V885;

    @FXML
    private Button V886;

    @FXML
    private Button V887;

    @FXML
    private Button V888;

    @FXML
    private Button V889;

    @FXML
    private Button V890;

    @FXML
    private Button V891;

    @FXML
    private Button V892;

    @FXML
    private Button V893;

    @FXML
    private Button V894;

    @FXML
    private Button V895;

    @FXML
    private Button V896;

    @FXML
    private Button V897;

    @FXML
    private Button V898;

    @FXML
    private Button V899;

    @FXML
    private Button V900;

    @FXML
    private Button V901;

    @FXML
    private Button V902;

    @FXML
    private Button V903;

    @FXML
    private Button V904;

    @FXML
    private Button V905;

    @FXML
    private Button V906;

    @FXML
    private Button V907;

    @FXML
    private Button V908;

    @FXML
    private Button V909;

    @FXML
    private Button V910;

    @FXML
    private Button V911;

    @FXML
    private Button V912;

    @FXML
    private Button V913;

    @FXML
    private Button V914;

    @FXML
    private Button V915;

    @FXML
    private Button V916;

    @FXML
    private Button V917;

    @FXML
    private Button V918;

    @FXML
    private Button V919;

    @FXML
    private Button V920;

    @FXML
    private Button V921;

    @FXML
    private Button V922;

    @FXML
    private Button V923;

    @FXML
    private Button V924;

    @FXML
    private Button V925;

    @FXML
    private Button V926;

    @FXML
    private Button V927;

    @FXML
    private Button V928;

    @FXML
    private Button V929;

    @FXML
    private Button V930;

    @FXML
    private Button V931;

    @FXML
    private Button V932;

    @FXML
    private Button V933;

    @FXML
    private Button V934;

    @FXML
    private Button V935;

    @FXML
    private Button V936;

    @FXML
    private Button V937;

    @FXML
    private Button V938;

    @FXML
    private Button V939;

    @FXML
    private Button V940;

    @FXML
    private Button V941;

    @FXML
    private Button V942;

    @FXML
    private Button V943;

    @FXML
    private Button V944;

    @FXML
    private Button V945;

    @FXML
    private Button V946;

    @FXML
    private Button V947;

    @FXML
    private Button V948;

    @FXML
    private Button V949;

    @FXML
    private Button V950;

    @FXML
    private Button V951;

    @FXML
    private Button V952;

    @FXML
    private Button V953;

    @FXML
    private Button V954;

    @FXML
    private Button V955;

    @FXML
    private Button V956;

    @FXML
    private Button V957;

    @FXML
    private Button V958;

    @FXML
    private Button V959;

    @FXML
    private Button V960;

    @FXML
    private Button V961;

    @FXML
    private Button V962;

    @FXML
    private Button V963;

    @FXML
    private Button V964;

    @FXML
    private Button V965;

    @FXML
    private Button V966;

    @FXML
    private Button V967;

    @FXML
    private Button V968;

    @FXML
    private Button V969;

    @FXML
    private Button V970;

    @FXML
    private Button V971;

    @FXML
    private Button V972;

    @FXML
    private Button V973;

    @FXML
    private Button V974;

    @FXML
    private Button V975;

    @FXML
    private Button V976;

    @FXML
    private Button V977;

    @FXML
    private Button V978;

    @FXML
    private Button V979;

    @FXML
    private Button V980;

    @FXML
    private Button V981;

    @FXML
    private Button V982;

    @FXML
    private Button V983;

    @FXML
    private Button V984;

    @FXML
    private Button V985;

    @FXML
    private Button V986;

    @FXML
    private Button V987;

    @FXML
    private Button V988;

    @FXML
    private Button V989;

    @FXML
    private Button V990;

    @FXML
    private Button V991;

    @FXML
    private Button V992;

    @FXML
    private Button V993;

    @FXML
    private Button V994;

    @FXML
    private Button V995;

    @FXML
    private Button V996;

    @FXML
    private Button V997;

    @FXML
    private Button V998;

    @FXML
    private Button V999;

    @FXML
    private Button V1000;

    @FXML
    private Button V1001;

    @FXML
    private Button V1002;

    @FXML
    private Button V1003;

    @FXML
    private Button V1004;

    @FXML
    private Button V1005;

    @FXML
    private Button V1006;

    @FXML
    private Button V1007;

    @FXML
    private Button V1008;

    @FXML
    private Button V1009;

    @FXML
    private Button V1010;

    @FXML
    private Button V1011;

    @FXML
    private Button V1012;

    @FXML
    private Button V1013;

    @FXML
    private Button V1014;

    @FXML
    private Button V1015;

    @FXML
    private Button V1016;

    @FXML
    private Button V1017;

    @FXML
    private Button V1018;

    @FXML
    private Button V1019;

    @FXML
    private Button V1020;

    @FXML
    private Button V1021;

    @FXML
    private Button V1022;

    @FXML
    private Button V1023;

    @FXML
    private Button V1024;

    @FXML
    private Button V1025;

    @FXML
    private Button V1026;

    @FXML
    private Button V1027;

    @FXML
    private Button V1028;

    @FXML
    private Button V1029;

    @FXML
    private Button V1030;

    @FXML
    private Button V1031;

    @FXML
    private Button V1032;

    @FXML
    private Button V1033;

    @FXML
    private Button V1034;

    @FXML
    private Button V1035;

    @FXML
    private Button V1036;

    @FXML
    private Button V1037;

    @FXML
    private Button V1038;

    @FXML
    private Button V1039;

    @FXML
    private Button V1040;

    @FXML
    private Button V1041;

    @FXML
    private Button V1042;

    @FXML
    private Button V1043;

    @FXML
    private Button V1044;

    @FXML
    private Button V1045;

    @FXML
    private Button V1046;

    @FXML
    private Button V1047;

    @FXML
    private Button V1048;

    @FXML
    private Button V1049;

    @FXML
    private Button V1050;

    @FXML
    private Button V1051;

    @FXML
    private Button V1052;

    @FXML
    private Button V1053;

    @FXML
    private Button V1054;

    @FXML
    private Button V1055;

    @FXML
    private Button V1056;

    @FXML
    private Button V1057;

    @FXML
    private Button V1058;

    @FXML
    private Button V1059;

    @FXML
    private Button V1060;

    @FXML
    private Button V1061;

    @FXML
    private Button V1062;

    @FXML
    private Button V1063;

    @FXML
    private Button V1064;

    @FXML
    private Button V1065;

    @FXML
    private Button V1066;

    @FXML
    private Button V1067;

    @FXML
    private Button V1068;

    @FXML
    private Button V1069;

    @FXML
    private Button V1070;

    @FXML
    private Button V1071;

    @FXML
    private Button V1072;

    @FXML
    private Button V1073;

    @FXML
    private Button V1074;

    @FXML
    private Button V1075;

    @FXML
    private Button V1076;

    @FXML
    private Button V1077;

    @FXML
    private Button V1078;

    @FXML
    private Button V1079;

    @FXML
    private Button V1080;

    @FXML
    private Button V1081;

    @FXML
    private Button V1082;

    @FXML
    private Button V1083;

    @FXML
    private Button V1084;

    @FXML
    private Button V1085;

    @FXML
    private Button V1086;

    @FXML
    private Button V1087;

    @FXML
    private Button V1088;

    @FXML
    private Button V1089;

    @FXML
    private Button V1090;

    @FXML
    private Button V1091;

    @FXML
    private Button V1092;

    @FXML
    private Button V1093;

    @FXML
    private Button V1094;

    @FXML
    private Button V1095;

    @FXML
    private Button V1096;

    @FXML
    private Button V1097;

    @FXML
    private Button V1098;

    @FXML
    private Button V1099;

    @FXML
    private Button V1100;

    @FXML
    private Button V1101;

    @FXML
    private Button V1102;

    @FXML
    private Button V1103;

    @FXML
    private Button V1104;

    @FXML
    private Button V1105;

    @FXML
    private Button V1106;

    @FXML
    private Button V1107;

    @FXML
    private Button V1108;

    @FXML
    private Button V1109;

    @FXML
    private Button V1110;

    @FXML
    private Button V1111;

    @FXML
    private Button V1112;

    @FXML
    private Button V1113;

    @FXML
    private Button V1114;

    @FXML
    private Button V1115;

    @FXML
    private Button V1116;

    @FXML
    private Button V1117;

    @FXML
    private Button V1118;

    @FXML
    private Button V1119;

    @FXML
    private Button V1120;

    @FXML
    private Button V1121;

    @FXML
    private Button V1122;

    @FXML
    private Button V1123;

    @FXML
    private Button V1124;

    @FXML
    private Button V1125;

    @FXML
    private Button V1126;

    @FXML
    private Button V1127;

    @FXML
    private Button V1128;

    @FXML
    private Button V1129;

    @FXML
    private Button V1130;

    @FXML
    private Button V1131;

    @FXML
    private Button V1132;

    @FXML
    private Button V1133;

    @FXML
    private Button V1134;

    @FXML
    private Button V1135;

    @FXML
    private Button V1136;

    @FXML
    private Button V1137;

    @FXML
    private Button V1138;

    @FXML
    private Button V1139;

    @FXML
    private Button V1140;

    @FXML
    private Button V1141;

    @FXML
    private Button V1142;

    @FXML
    private Button V1143;

    @FXML
    private Button V1144;

    @FXML
    private Button V1145;

    @FXML
    private Button V1146;

    @FXML
    private Button V1147;

    @FXML
    private Button V1148;

    @FXML
    private Button V1149;

    @FXML
    private Button V1150;

    @FXML
    private Button V1151;

    @FXML
    private Button V1152;

    @FXML
    private Button V1153;

    @FXML
    private Button V1154;

    @FXML
    private Button V1155;

    @FXML
    private Button V1156;

    @FXML
    private Button V1157;

    @FXML
    private Button V1158;

    @FXML
    private Button V1159;

    @FXML
    private Button V1160;

    @FXML
    private Button V1161;

    @FXML
    private Button V1162;

    @FXML
    private Button V1163;

    @FXML
    private Button V1164;

    @FXML
    private Button V1165;

    @FXML
    private Button V1166;

    @FXML
    private Button V1167;

    @FXML
    private Button V1168;

    @FXML
    private Button V1169;

    @FXML
    private Button V1170;

    @FXML
    private Button V1171;

    @FXML
    private Button V1172;

    @FXML
    private Button V1173;

    @FXML
    private Button V1174;

    @FXML
    private Button V1175;

    @FXML
    private Button V1176;

    @FXML
    private Button V1177;

    @FXML
    private Button V1178;

    @FXML
    private Button V1179;

    @FXML
    private Button V1180;

    @FXML
    private Button V1181;

    @FXML
    private Button V1182;

    @FXML
    private Button V1183;

    @FXML
    private Button V1184;

    @FXML
    private Button V1185;

    @FXML
    private Button V1186;

    @FXML
    private Button V1187;

    @FXML
    private Button V1188;

    @FXML
    private Button V1189;

    @FXML
    private Button V1190;

    @FXML
    private Button V1191;

    @FXML
    private Button V1192;

    @FXML
    private Button V1193;

    @FXML
    private Button V1194;

    @FXML
    private Button V1195;

    @FXML
    private Button V1196;

    @FXML
    private Button V1197;

    @FXML
    private Button V1198;

    @FXML
    private Button V1199;

    @FXML
    private Button V1200;

    @FXML
    private Button V1201;

    @FXML
    private Button V1202;

    @FXML
    private Button V1203;

    @FXML
    private Button V1204;

    @FXML
    private Button V1205;

    @FXML
    private Button V1206;

    @FXML
    private Button V1207;

    @FXML
    private Button V1208;

    @FXML
    private Button V1209;

    @FXML
    private Button V1210;

    @FXML
    private Button V1211;

    @FXML
    private Button V1212;

    @FXML
    private Button V1213;

    @FXML
    private Button V1214;

    @FXML
    private Button V1215;

    @FXML
    private Button V1216;

    @FXML
    private Button V1217;

    @FXML
    private Button V1218;

    @FXML
    private Button V1219;

    @FXML
    private Button V1220;

    @FXML
    private Button V1221;

    @FXML
    private Button V1222;

    @FXML
    private Button V1223;

    @FXML
    private Button V1224;

    @FXML
    private Button V1225;

    @FXML
    private Button V1226;

    @FXML
    private Button V1227;

    @FXML
    private Button V1228;

    @FXML
    private Button V1229;

    @FXML
    private Button V1230;

    @FXML
    private Button V1231;

    @FXML
    private Button V1232;

    @FXML
    private Button V1233;

    @FXML
    private Button V1234;

    @FXML
    private Button V1235;

    @FXML
    private Button V1236;

    @FXML
    private Button V1237;

    @FXML
    private Button V1238;

    @FXML
    private Button V1239;

    @FXML
    private Button V1240;

    @FXML
    private Button V1241;

    @FXML
    private Button V1242;

    @FXML
    private Button V1243;

    @FXML
    private Button V1244;

    @FXML
    private Button V1245;

    @FXML
    private Button V1246;

    @FXML
    private Button V1247;

    @FXML
    private Button V1248;

    @FXML
    private Button V1249;

    @FXML
    private Button V1250;

    @FXML
    private Button V1251;

    @FXML
    private Button V1252;

    @FXML
    private Button V1253;

    @FXML
    private Button V1254;

    @FXML
    private Button V1255;

    @FXML
    private Button V1256;

    @FXML
    private Button V1257;

    @FXML
    private Button V1258;

    @FXML
    private Button V1259;

    @FXML
    private Button V1260;

    @FXML
    private Button V1261;

    @FXML
    private Button V1262;

    @FXML
    private Button V1263;

    @FXML
    private Button V1264;

    @FXML
    private Button V1265;

    @FXML
    private Button V1266;

    @FXML
    private Button V1267;

    @FXML
    private Button V1268;

    @FXML
    private Button V1269;

    @FXML
    private Button V1270;

    @FXML
    private Button V1271;

    @FXML
    private Button V1272;

    @FXML
    private Button V1273;

    @FXML
    private Button V1274;

    @FXML
    private Button V1275;

    @FXML
    private Label ScoreLab;
    @FXML
    private Label TimeLab;
    @FXML
    private JFXButton Back;

    int Startpoint;
    int WallArray[];
    int Endpoint;
    int shortestDist;
    int solutionPath[];

    public Object ObjectsOfButtion[]= new Object[1276];
    public Map<String ,Button> v = new HashMap<String ,Button>();

    int GreePathPoint;
    int Score=0;
    int Time=0,winner=0;


    public void ReturnId(ActionEvent actionEvent) {
        Object a = actionEvent.getSource();

    }
    public void close(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void Minimize(MouseEvent mouseEvent) {
        Stage s= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        s.setIconified(true);
    }
    void InitilizerBtn(){
        ObjectsOfButtion[1]=V1;
        ObjectsOfButtion[2]=V2;
        ObjectsOfButtion[3]=V3;
        ObjectsOfButtion[4]=V4;
        ObjectsOfButtion[5]=V5;
        ObjectsOfButtion[6]=V6;
        ObjectsOfButtion[7]=V7;
        ObjectsOfButtion[8]=V8;
        ObjectsOfButtion[9]=V9;
        ObjectsOfButtion[10]=V10;
        ObjectsOfButtion[11]=V11;
        ObjectsOfButtion[12]=V12;
        ObjectsOfButtion[13]=V13;
        ObjectsOfButtion[14]=V14;
        ObjectsOfButtion[15]=V15;
        ObjectsOfButtion[16]=V16;
        ObjectsOfButtion[17]=V17;
        ObjectsOfButtion[18]=V18;
        ObjectsOfButtion[19]=V19;
        ObjectsOfButtion[20]=V20;
        ObjectsOfButtion[21]=V21;
        ObjectsOfButtion[22]=V22;
        ObjectsOfButtion[23]=V23;
        ObjectsOfButtion[24]=V24;
        ObjectsOfButtion[25]=V25;
        ObjectsOfButtion[26]=V26;
        ObjectsOfButtion[27]=V27;
        ObjectsOfButtion[28]=V28;
        ObjectsOfButtion[29]=V29;
        ObjectsOfButtion[30]=V30;
        ObjectsOfButtion[31]=V31;
        ObjectsOfButtion[32]=V32;
        ObjectsOfButtion[33]=V33;
        ObjectsOfButtion[34]=V34;
        ObjectsOfButtion[35]=V35;
        ObjectsOfButtion[36]=V36;
        ObjectsOfButtion[37]=V37;
        ObjectsOfButtion[38]=V38;
        ObjectsOfButtion[39]=V39;
        ObjectsOfButtion[40]=V40;
        ObjectsOfButtion[41]=V41;
        ObjectsOfButtion[42]=V42;
        ObjectsOfButtion[43]=V43;
        ObjectsOfButtion[44]=V44;
        ObjectsOfButtion[45]=V45;
        ObjectsOfButtion[46]=V46;
        ObjectsOfButtion[47]=V47;
        ObjectsOfButtion[48]=V48;
        ObjectsOfButtion[49]=V49;
        ObjectsOfButtion[50]=V50;
        ObjectsOfButtion[51]=V51;
        ObjectsOfButtion[52]=V52;
        ObjectsOfButtion[53]=V53;
        ObjectsOfButtion[54]=V54;
        ObjectsOfButtion[55]=V55;
        ObjectsOfButtion[56]=V56;
        ObjectsOfButtion[57]=V57;
        ObjectsOfButtion[58]=V58;
        ObjectsOfButtion[59]=V59;
        ObjectsOfButtion[60]=V60;
        ObjectsOfButtion[61]=V61;
        ObjectsOfButtion[62]=V62;
        ObjectsOfButtion[63]=V63;
        ObjectsOfButtion[64]=V64;
        ObjectsOfButtion[65]=V65;
        ObjectsOfButtion[66]=V66;
        ObjectsOfButtion[67]=V67;
        ObjectsOfButtion[68]=V68;
        ObjectsOfButtion[69]=V69;
        ObjectsOfButtion[70]=V70;
        ObjectsOfButtion[71]=V71;
        ObjectsOfButtion[72]=V72;
        ObjectsOfButtion[73]=V73;
        ObjectsOfButtion[74]=V74;
        ObjectsOfButtion[75]=V75;
        ObjectsOfButtion[76]=V76;
        ObjectsOfButtion[77]=V77;
        ObjectsOfButtion[78]=V78;
        ObjectsOfButtion[79]=V79;
        ObjectsOfButtion[80]=V80;
        ObjectsOfButtion[81]=V81;
        ObjectsOfButtion[82]=V82;
        ObjectsOfButtion[83]=V83;
        ObjectsOfButtion[84]=V84;
        ObjectsOfButtion[85]=V85;
        ObjectsOfButtion[86]=V86;
        ObjectsOfButtion[87]=V87;
        ObjectsOfButtion[88]=V88;
        ObjectsOfButtion[89]=V89;
        ObjectsOfButtion[90]=V90;
        ObjectsOfButtion[91]=V91;
        ObjectsOfButtion[92]=V92;
        ObjectsOfButtion[93]=V93;
        ObjectsOfButtion[94]=V94;
        ObjectsOfButtion[95]=V95;
        ObjectsOfButtion[96]=V96;
        ObjectsOfButtion[97]=V97;
        ObjectsOfButtion[98]=V98;
        ObjectsOfButtion[99]=V99;
        ObjectsOfButtion[100]=V100;
        ObjectsOfButtion[101]=V101;
        ObjectsOfButtion[102]=V102;
        ObjectsOfButtion[103]=V103;
        ObjectsOfButtion[104]=V104;
        ObjectsOfButtion[105]=V105;
        ObjectsOfButtion[106]=V106;
        ObjectsOfButtion[107]=V107;
        ObjectsOfButtion[108]=V108;
        ObjectsOfButtion[109]=V109;
        ObjectsOfButtion[110]=V110;
        ObjectsOfButtion[111]=V111;
        ObjectsOfButtion[112]=V112;
        ObjectsOfButtion[113]=V113;
        ObjectsOfButtion[114]=V114;
        ObjectsOfButtion[115]=V115;
        ObjectsOfButtion[116]=V116;
        ObjectsOfButtion[117]=V117;
        ObjectsOfButtion[118]=V118;
        ObjectsOfButtion[119]=V119;
        ObjectsOfButtion[120]=V120;
        ObjectsOfButtion[121]=V121;
        ObjectsOfButtion[122]=V122;
        ObjectsOfButtion[123]=V123;
        ObjectsOfButtion[124]=V124;
        ObjectsOfButtion[125]=V125;
        ObjectsOfButtion[126]=V126;
        ObjectsOfButtion[127]=V127;
        ObjectsOfButtion[128]=V128;
        ObjectsOfButtion[129]=V129;
        ObjectsOfButtion[130]=V130;
        ObjectsOfButtion[131]=V131;
        ObjectsOfButtion[132]=V132;
        ObjectsOfButtion[133]=V133;
        ObjectsOfButtion[134]=V134;
        ObjectsOfButtion[135]=V135;
        ObjectsOfButtion[136]=V136;
        ObjectsOfButtion[137]=V137;
        ObjectsOfButtion[138]=V138;
        ObjectsOfButtion[139]=V139;
        ObjectsOfButtion[140]=V140;
        ObjectsOfButtion[141]=V141;
        ObjectsOfButtion[142]=V142;
        ObjectsOfButtion[143]=V143;
        ObjectsOfButtion[144]=V144;
        ObjectsOfButtion[145]=V145;
        ObjectsOfButtion[146]=V146;
        ObjectsOfButtion[147]=V147;
        ObjectsOfButtion[148]=V148;
        ObjectsOfButtion[149]=V149;
        ObjectsOfButtion[150]=V150;
        ObjectsOfButtion[151]=V151;
        ObjectsOfButtion[152]=V152;
        ObjectsOfButtion[153]=V153;
        ObjectsOfButtion[154]=V154;
        ObjectsOfButtion[155]=V155;
        ObjectsOfButtion[156]=V156;
        ObjectsOfButtion[157]=V157;
        ObjectsOfButtion[158]=V158;
        ObjectsOfButtion[159]=V159;
        ObjectsOfButtion[160]=V160;
        ObjectsOfButtion[161]=V161;
        ObjectsOfButtion[162]=V162;
        ObjectsOfButtion[163]=V163;
        ObjectsOfButtion[164]=V164;
        ObjectsOfButtion[165]=V165;
        ObjectsOfButtion[166]=V166;
        ObjectsOfButtion[167]=V167;
        ObjectsOfButtion[168]=V168;
        ObjectsOfButtion[169]=V169;
        ObjectsOfButtion[170]=V170;
        ObjectsOfButtion[171]=V171;
        ObjectsOfButtion[172]=V172;
        ObjectsOfButtion[173]=V173;
        ObjectsOfButtion[174]=V174;
        ObjectsOfButtion[175]=V175;
        ObjectsOfButtion[176]=V176;
        ObjectsOfButtion[177]=V177;
        ObjectsOfButtion[178]=V178;
        ObjectsOfButtion[179]=V179;
        ObjectsOfButtion[180]=V180;
        ObjectsOfButtion[181]=V181;
        ObjectsOfButtion[182]=V182;
        ObjectsOfButtion[183]=V183;
        ObjectsOfButtion[184]=V184;
        ObjectsOfButtion[185]=V185;
        ObjectsOfButtion[186]=V186;
        ObjectsOfButtion[187]=V187;
        ObjectsOfButtion[188]=V188;
        ObjectsOfButtion[189]=V189;
        ObjectsOfButtion[190]=V190;
        ObjectsOfButtion[191]=V191;
        ObjectsOfButtion[192]=V192;
        ObjectsOfButtion[193]=V193;
        ObjectsOfButtion[194]=V194;
        ObjectsOfButtion[195]=V195;
        ObjectsOfButtion[196]=V196;
        ObjectsOfButtion[197]=V197;
        ObjectsOfButtion[198]=V198;
        ObjectsOfButtion[199]=V199;
        ObjectsOfButtion[200]=V200;
        ObjectsOfButtion[201]=V201;
        ObjectsOfButtion[202]=V202;
        ObjectsOfButtion[203]=V203;
        ObjectsOfButtion[204]=V204;
        ObjectsOfButtion[205]=V205;
        ObjectsOfButtion[206]=V206;
        ObjectsOfButtion[207]=V207;
        ObjectsOfButtion[208]=V208;
        ObjectsOfButtion[209]=V209;
        ObjectsOfButtion[210]=V210;
        ObjectsOfButtion[211]=V211;
        ObjectsOfButtion[212]=V212;
        ObjectsOfButtion[213]=V213;
        ObjectsOfButtion[214]=V214;
        ObjectsOfButtion[215]=V215;
        ObjectsOfButtion[216]=V216;
        ObjectsOfButtion[217]=V217;
        ObjectsOfButtion[218]=V218;
        ObjectsOfButtion[219]=V219;
        ObjectsOfButtion[220]=V220;
        ObjectsOfButtion[221]=V221;
        ObjectsOfButtion[222]=V222;
        ObjectsOfButtion[223]=V223;
        ObjectsOfButtion[224]=V224;
        ObjectsOfButtion[225]=V225;
        ObjectsOfButtion[226]=V226;
        ObjectsOfButtion[227]=V227;
        ObjectsOfButtion[228]=V228;
        ObjectsOfButtion[229]=V229;
        ObjectsOfButtion[230]=V230;
        ObjectsOfButtion[231]=V231;
        ObjectsOfButtion[232]=V232;
        ObjectsOfButtion[233]=V233;
        ObjectsOfButtion[234]=V234;
        ObjectsOfButtion[235]=V235;
        ObjectsOfButtion[236]=V236;
        ObjectsOfButtion[237]=V237;
        ObjectsOfButtion[238]=V238;
        ObjectsOfButtion[239]=V239;
        ObjectsOfButtion[240]=V240;
        ObjectsOfButtion[241]=V241;
        ObjectsOfButtion[242]=V242;
        ObjectsOfButtion[243]=V243;
        ObjectsOfButtion[244]=V244;
        ObjectsOfButtion[245]=V245;
        ObjectsOfButtion[246]=V246;
        ObjectsOfButtion[247]=V247;
        ObjectsOfButtion[248]=V248;
        ObjectsOfButtion[249]=V249;
        ObjectsOfButtion[250]=V250;
        ObjectsOfButtion[251]=V251;
        ObjectsOfButtion[252]=V252;
        ObjectsOfButtion[253]=V253;
        ObjectsOfButtion[254]=V254;
        ObjectsOfButtion[255]=V255;
        ObjectsOfButtion[256]=V256;
        ObjectsOfButtion[257]=V257;
        ObjectsOfButtion[258]=V258;
        ObjectsOfButtion[259]=V259;
        ObjectsOfButtion[260]=V260;
        ObjectsOfButtion[261]=V261;
        ObjectsOfButtion[262]=V262;
        ObjectsOfButtion[263]=V263;
        ObjectsOfButtion[264]=V264;
        ObjectsOfButtion[265]=V265;
        ObjectsOfButtion[266]=V266;
        ObjectsOfButtion[267]=V267;
        ObjectsOfButtion[268]=V268;
        ObjectsOfButtion[269]=V269;
        ObjectsOfButtion[270]=V270;
        ObjectsOfButtion[271]=V271;
        ObjectsOfButtion[272]=V272;
        ObjectsOfButtion[273]=V273;
        ObjectsOfButtion[274]=V274;
        ObjectsOfButtion[275]=V275;
        ObjectsOfButtion[276]=V276;
        ObjectsOfButtion[277]=V277;
        ObjectsOfButtion[278]=V278;
        ObjectsOfButtion[279]=V279;
        ObjectsOfButtion[280]=V280;
        ObjectsOfButtion[281]=V281;
        ObjectsOfButtion[282]=V282;
        ObjectsOfButtion[283]=V283;
        ObjectsOfButtion[284]=V284;
        ObjectsOfButtion[285]=V285;
        ObjectsOfButtion[286]=V286;
        ObjectsOfButtion[287]=V287;
        ObjectsOfButtion[288]=V288;
        ObjectsOfButtion[289]=V289;
        ObjectsOfButtion[290]=V290;
        ObjectsOfButtion[291]=V291;
        ObjectsOfButtion[292]=V292;
        ObjectsOfButtion[293]=V293;
        ObjectsOfButtion[294]=V294;
        ObjectsOfButtion[295]=V295;
        ObjectsOfButtion[296]=V296;
        ObjectsOfButtion[297]=V297;
        ObjectsOfButtion[298]=V298;
        ObjectsOfButtion[299]=V299;
        ObjectsOfButtion[300]=V300;
        ObjectsOfButtion[301]=V301;
        ObjectsOfButtion[302]=V302;
        ObjectsOfButtion[303]=V303;
        ObjectsOfButtion[304]=V304;
        ObjectsOfButtion[305]=V305;
        ObjectsOfButtion[306]=V306;
        ObjectsOfButtion[307]=V307;
        ObjectsOfButtion[308]=V308;
        ObjectsOfButtion[309]=V309;
        ObjectsOfButtion[310]=V310;
        ObjectsOfButtion[311]=V311;
        ObjectsOfButtion[312]=V312;
        ObjectsOfButtion[313]=V313;
        ObjectsOfButtion[314]=V314;
        ObjectsOfButtion[315]=V315;
        ObjectsOfButtion[316]=V316;
        ObjectsOfButtion[317]=V317;
        ObjectsOfButtion[318]=V318;
        ObjectsOfButtion[319]=V319;
        ObjectsOfButtion[320]=V320;
        ObjectsOfButtion[321]=V321;
        ObjectsOfButtion[322]=V322;
        ObjectsOfButtion[323]=V323;
        ObjectsOfButtion[324]=V324;
        ObjectsOfButtion[325]=V325;
        ObjectsOfButtion[326]=V326;
        ObjectsOfButtion[327]=V327;
        ObjectsOfButtion[328]=V328;
        ObjectsOfButtion[329]=V329;
        ObjectsOfButtion[330]=V330;
        ObjectsOfButtion[331]=V331;
        ObjectsOfButtion[332]=V332;
        ObjectsOfButtion[333]=V333;
        ObjectsOfButtion[334]=V334;
        ObjectsOfButtion[335]=V335;
        ObjectsOfButtion[336]=V336;
        ObjectsOfButtion[337]=V337;
        ObjectsOfButtion[338]=V338;
        ObjectsOfButtion[339]=V339;
        ObjectsOfButtion[340]=V340;
        ObjectsOfButtion[341]=V341;
        ObjectsOfButtion[342]=V342;
        ObjectsOfButtion[343]=V343;
        ObjectsOfButtion[344]=V344;
        ObjectsOfButtion[345]=V345;
        ObjectsOfButtion[346]=V346;
        ObjectsOfButtion[347]=V347;
        ObjectsOfButtion[348]=V348;
        ObjectsOfButtion[349]=V349;
        ObjectsOfButtion[350]=V350;
        ObjectsOfButtion[351]=V351;
        ObjectsOfButtion[352]=V352;
        ObjectsOfButtion[353]=V353;
        ObjectsOfButtion[354]=V354;
        ObjectsOfButtion[355]=V355;
        ObjectsOfButtion[356]=V356;
        ObjectsOfButtion[357]=V357;
        ObjectsOfButtion[358]=V358;
        ObjectsOfButtion[359]=V359;
        ObjectsOfButtion[360]=V360;
        ObjectsOfButtion[361]=V361;
        ObjectsOfButtion[362]=V362;
        ObjectsOfButtion[363]=V363;
        ObjectsOfButtion[364]=V364;
        ObjectsOfButtion[365]=V365;
        ObjectsOfButtion[366]=V366;
        ObjectsOfButtion[367]=V367;
        ObjectsOfButtion[368]=V368;
        ObjectsOfButtion[369]=V369;
        ObjectsOfButtion[370]=V370;
        ObjectsOfButtion[371]=V371;
        ObjectsOfButtion[372]=V372;
        ObjectsOfButtion[373]=V373;
        ObjectsOfButtion[374]=V374;
        ObjectsOfButtion[375]=V375;
        ObjectsOfButtion[376]=V376;
        ObjectsOfButtion[377]=V377;
        ObjectsOfButtion[378]=V378;
        ObjectsOfButtion[379]=V379;
        ObjectsOfButtion[380]=V380;
        ObjectsOfButtion[381]=V381;
        ObjectsOfButtion[382]=V382;
        ObjectsOfButtion[383]=V383;
        ObjectsOfButtion[384]=V384;
        ObjectsOfButtion[385]=V385;
        ObjectsOfButtion[386]=V386;
        ObjectsOfButtion[387]=V387;
        ObjectsOfButtion[388]=V388;
        ObjectsOfButtion[389]=V389;
        ObjectsOfButtion[390]=V390;
        ObjectsOfButtion[391]=V391;
        ObjectsOfButtion[392]=V392;
        ObjectsOfButtion[393]=V393;
        ObjectsOfButtion[394]=V394;
        ObjectsOfButtion[395]=V395;
        ObjectsOfButtion[396]=V396;
        ObjectsOfButtion[397]=V397;
        ObjectsOfButtion[398]=V398;
        ObjectsOfButtion[399]=V399;
        ObjectsOfButtion[400]=V400;
        ObjectsOfButtion[401]=V401;
        ObjectsOfButtion[402]=V402;
        ObjectsOfButtion[403]=V403;
        ObjectsOfButtion[404]=V404;
        ObjectsOfButtion[405]=V405;
        ObjectsOfButtion[406]=V406;
        ObjectsOfButtion[407]=V407;
        ObjectsOfButtion[408]=V408;
        ObjectsOfButtion[409]=V409;
        ObjectsOfButtion[410]=V410;
        ObjectsOfButtion[411]=V411;
        ObjectsOfButtion[412]=V412;
        ObjectsOfButtion[413]=V413;
        ObjectsOfButtion[414]=V414;
        ObjectsOfButtion[415]=V415;
        ObjectsOfButtion[416]=V416;
        ObjectsOfButtion[417]=V417;
        ObjectsOfButtion[418]=V418;
        ObjectsOfButtion[419]=V419;
        ObjectsOfButtion[420]=V420;
        ObjectsOfButtion[421]=V421;
        ObjectsOfButtion[422]=V422;
        ObjectsOfButtion[423]=V423;
        ObjectsOfButtion[424]=V424;
        ObjectsOfButtion[425]=V425;
        ObjectsOfButtion[426]=V426;
        ObjectsOfButtion[427]=V427;
        ObjectsOfButtion[428]=V428;
        ObjectsOfButtion[429]=V429;
        ObjectsOfButtion[430]=V430;
        ObjectsOfButtion[431]=V431;
        ObjectsOfButtion[432]=V432;
        ObjectsOfButtion[433]=V433;
        ObjectsOfButtion[434]=V434;
        ObjectsOfButtion[435]=V435;
        ObjectsOfButtion[436]=V436;
        ObjectsOfButtion[437]=V437;
        ObjectsOfButtion[438]=V438;
        ObjectsOfButtion[439]=V439;
        ObjectsOfButtion[440]=V440;
        ObjectsOfButtion[441]=V441;
        ObjectsOfButtion[442]=V442;
        ObjectsOfButtion[443]=V443;
        ObjectsOfButtion[444]=V444;
        ObjectsOfButtion[445]=V445;
        ObjectsOfButtion[446]=V446;
        ObjectsOfButtion[447]=V447;
        ObjectsOfButtion[448]=V448;
        ObjectsOfButtion[449]=V449;
        ObjectsOfButtion[450]=V450;
        ObjectsOfButtion[451]=V451;
        ObjectsOfButtion[452]=V452;
        ObjectsOfButtion[453]=V453;
        ObjectsOfButtion[454]=V454;
        ObjectsOfButtion[455]=V455;
        ObjectsOfButtion[456]=V456;
        ObjectsOfButtion[457]=V457;
        ObjectsOfButtion[458]=V458;
        ObjectsOfButtion[459]=V459;
        ObjectsOfButtion[460]=V460;
        ObjectsOfButtion[461]=V461;
        ObjectsOfButtion[462]=V462;
        ObjectsOfButtion[463]=V463;
        ObjectsOfButtion[464]=V464;
        ObjectsOfButtion[465]=V465;
        ObjectsOfButtion[466]=V466;
        ObjectsOfButtion[467]=V467;
        ObjectsOfButtion[468]=V468;
        ObjectsOfButtion[469]=V469;
        ObjectsOfButtion[470]=V470;
        ObjectsOfButtion[471]=V471;
        ObjectsOfButtion[472]=V472;
        ObjectsOfButtion[473]=V473;
        ObjectsOfButtion[474]=V474;
        ObjectsOfButtion[475]=V475;
        ObjectsOfButtion[476]=V476;
        ObjectsOfButtion[477]=V477;
        ObjectsOfButtion[478]=V478;
        ObjectsOfButtion[479]=V479;
        ObjectsOfButtion[480]=V480;
        ObjectsOfButtion[481]=V481;
        ObjectsOfButtion[482]=V482;
        ObjectsOfButtion[483]=V483;
        ObjectsOfButtion[484]=V484;
        ObjectsOfButtion[485]=V485;
        ObjectsOfButtion[486]=V486;
        ObjectsOfButtion[487]=V487;
        ObjectsOfButtion[488]=V488;
        ObjectsOfButtion[489]=V489;
        ObjectsOfButtion[490]=V490;
        ObjectsOfButtion[491]=V491;
        ObjectsOfButtion[492]=V492;
        ObjectsOfButtion[493]=V493;
        ObjectsOfButtion[494]=V494;
        ObjectsOfButtion[495]=V495;
        ObjectsOfButtion[496]=V496;
        ObjectsOfButtion[497]=V497;
        ObjectsOfButtion[498]=V498;
        ObjectsOfButtion[499]=V499;
        ObjectsOfButtion[500]=V500;
        ObjectsOfButtion[501]=V501;
        ObjectsOfButtion[502]=V502;
        ObjectsOfButtion[503]=V503;
        ObjectsOfButtion[504]=V504;
        ObjectsOfButtion[505]=V505;
        ObjectsOfButtion[506]=V506;
        ObjectsOfButtion[507]=V507;
        ObjectsOfButtion[508]=V508;
        ObjectsOfButtion[509]=V509;
        ObjectsOfButtion[510]=V510;
        ObjectsOfButtion[511]=V511;
        ObjectsOfButtion[512]=V512;
        ObjectsOfButtion[513]=V513;
        ObjectsOfButtion[514]=V514;
        ObjectsOfButtion[515]=V515;
        ObjectsOfButtion[516]=V516;
        ObjectsOfButtion[517]=V517;
        ObjectsOfButtion[518]=V518;
        ObjectsOfButtion[519]=V519;
        ObjectsOfButtion[520]=V520;
        ObjectsOfButtion[521]=V521;
        ObjectsOfButtion[522]=V522;
        ObjectsOfButtion[523]=V523;
        ObjectsOfButtion[524]=V524;
        ObjectsOfButtion[525]=V525;
        ObjectsOfButtion[526]=V526;
        ObjectsOfButtion[527]=V527;
        ObjectsOfButtion[528]=V528;
        ObjectsOfButtion[529]=V529;
        ObjectsOfButtion[530]=V530;
        ObjectsOfButtion[531]=V531;
        ObjectsOfButtion[532]=V532;
        ObjectsOfButtion[533]=V533;
        ObjectsOfButtion[534]=V534;
        ObjectsOfButtion[535]=V535;
        ObjectsOfButtion[536]=V536;
        ObjectsOfButtion[537]=V537;
        ObjectsOfButtion[538]=V538;
        ObjectsOfButtion[539]=V539;
        ObjectsOfButtion[540]=V540;
        ObjectsOfButtion[541]=V541;
        ObjectsOfButtion[542]=V542;
        ObjectsOfButtion[543]=V543;
        ObjectsOfButtion[544]=V544;
        ObjectsOfButtion[545]=V545;
        ObjectsOfButtion[546]=V546;
        ObjectsOfButtion[547]=V547;
        ObjectsOfButtion[548]=V548;
        ObjectsOfButtion[549]=V549;
        ObjectsOfButtion[550]=V550;
        ObjectsOfButtion[551]=V551;
        ObjectsOfButtion[552]=V552;
        ObjectsOfButtion[553]=V553;
        ObjectsOfButtion[554]=V554;
        ObjectsOfButtion[555]=V555;
        ObjectsOfButtion[556]=V556;
        ObjectsOfButtion[557]=V557;
        ObjectsOfButtion[558]=V558;
        ObjectsOfButtion[559]=V559;
        ObjectsOfButtion[560]=V560;
        ObjectsOfButtion[561]=V561;
        ObjectsOfButtion[562]=V562;
        ObjectsOfButtion[563]=V563;
        ObjectsOfButtion[564]=V564;
        ObjectsOfButtion[565]=V565;
        ObjectsOfButtion[566]=V566;
        ObjectsOfButtion[567]=V567;
        ObjectsOfButtion[568]=V568;
        ObjectsOfButtion[569]=V569;
        ObjectsOfButtion[570]=V570;
        ObjectsOfButtion[571]=V571;
        ObjectsOfButtion[572]=V572;
        ObjectsOfButtion[573]=V573;
        ObjectsOfButtion[574]=V574;
        ObjectsOfButtion[575]=V575;
        ObjectsOfButtion[576]=V576;
        ObjectsOfButtion[577]=V577;
        ObjectsOfButtion[578]=V578;
        ObjectsOfButtion[579]=V579;
        ObjectsOfButtion[580]=V580;
        ObjectsOfButtion[581]=V581;
        ObjectsOfButtion[582]=V582;
        ObjectsOfButtion[583]=V583;
        ObjectsOfButtion[584]=V584;
        ObjectsOfButtion[585]=V585;
        ObjectsOfButtion[586]=V586;
        ObjectsOfButtion[587]=V587;
        ObjectsOfButtion[588]=V588;
        ObjectsOfButtion[589]=V589;
        ObjectsOfButtion[590]=V590;
        ObjectsOfButtion[591]=V591;
        ObjectsOfButtion[592]=V592;
        ObjectsOfButtion[593]=V593;
        ObjectsOfButtion[594]=V594;
        ObjectsOfButtion[595]=V595;
        ObjectsOfButtion[596]=V596;
        ObjectsOfButtion[597]=V597;
        ObjectsOfButtion[598]=V598;
        ObjectsOfButtion[599]=V599;
        ObjectsOfButtion[600]=V600;
        ObjectsOfButtion[601]=V601;
        ObjectsOfButtion[602]=V602;
        ObjectsOfButtion[603]=V603;
        ObjectsOfButtion[604]=V604;
        ObjectsOfButtion[605]=V605;
        ObjectsOfButtion[606]=V606;
        ObjectsOfButtion[607]=V607;
        ObjectsOfButtion[608]=V608;
        ObjectsOfButtion[609]=V609;
        ObjectsOfButtion[610]=V610;
        ObjectsOfButtion[611]=V611;
        ObjectsOfButtion[612]=V612;
        ObjectsOfButtion[613]=V613;
        ObjectsOfButtion[614]=V614;
        ObjectsOfButtion[615]=V615;
        ObjectsOfButtion[616]=V616;
        ObjectsOfButtion[617]=V617;
        ObjectsOfButtion[618]=V618;
        ObjectsOfButtion[619]=V619;
        ObjectsOfButtion[620]=V620;
        ObjectsOfButtion[621]=V621;
        ObjectsOfButtion[622]=V622;
        ObjectsOfButtion[623]=V623;
        ObjectsOfButtion[624]=V624;
        ObjectsOfButtion[625]=V625;
        ObjectsOfButtion[626]=V626;
        ObjectsOfButtion[627]=V627;
        ObjectsOfButtion[628]=V628;
        ObjectsOfButtion[629]=V629;
        ObjectsOfButtion[630]=V630;
        ObjectsOfButtion[631]=V631;
        ObjectsOfButtion[632]=V632;
        ObjectsOfButtion[633]=V633;
        ObjectsOfButtion[634]=V634;
        ObjectsOfButtion[635]=V635;
        ObjectsOfButtion[636]=V636;
        ObjectsOfButtion[637]=V637;
        ObjectsOfButtion[638]=V638;
        ObjectsOfButtion[639]=V639;
        ObjectsOfButtion[640]=V640;
        ObjectsOfButtion[641]=V641;
        ObjectsOfButtion[642]=V642;
        ObjectsOfButtion[643]=V643;
        ObjectsOfButtion[644]=V644;
        ObjectsOfButtion[645]=V645;
        ObjectsOfButtion[646]=V646;
        ObjectsOfButtion[647]=V647;
        ObjectsOfButtion[648]=V648;
        ObjectsOfButtion[649]=V649;
        ObjectsOfButtion[650]=V650;
        ObjectsOfButtion[651]=V651;
        ObjectsOfButtion[652]=V652;
        ObjectsOfButtion[653]=V653;
        ObjectsOfButtion[654]=V654;
        ObjectsOfButtion[655]=V655;
        ObjectsOfButtion[656]=V656;
        ObjectsOfButtion[657]=V657;
        ObjectsOfButtion[658]=V658;
        ObjectsOfButtion[659]=V659;
        ObjectsOfButtion[660]=V660;
        ObjectsOfButtion[661]=V661;
        ObjectsOfButtion[662]=V662;
        ObjectsOfButtion[663]=V663;
        ObjectsOfButtion[664]=V664;
        ObjectsOfButtion[665]=V665;
        ObjectsOfButtion[666]=V666;
        ObjectsOfButtion[667]=V667;
        ObjectsOfButtion[668]=V668;
        ObjectsOfButtion[669]=V669;
        ObjectsOfButtion[670]=V670;
        ObjectsOfButtion[671]=V671;
        ObjectsOfButtion[672]=V672;
        ObjectsOfButtion[673]=V673;
        ObjectsOfButtion[674]=V674;
        ObjectsOfButtion[675]=V675;
        ObjectsOfButtion[676]=V676;
        ObjectsOfButtion[677]=V677;
        ObjectsOfButtion[678]=V678;
        ObjectsOfButtion[679]=V679;
        ObjectsOfButtion[680]=V680;
        ObjectsOfButtion[681]=V681;
        ObjectsOfButtion[682]=V682;
        ObjectsOfButtion[683]=V683;
        ObjectsOfButtion[684]=V684;
        ObjectsOfButtion[685]=V685;
        ObjectsOfButtion[686]=V686;
        ObjectsOfButtion[687]=V687;
        ObjectsOfButtion[688]=V688;
        ObjectsOfButtion[689]=V689;
        ObjectsOfButtion[690]=V690;
        ObjectsOfButtion[691]=V691;
        ObjectsOfButtion[692]=V692;
        ObjectsOfButtion[693]=V693;
        ObjectsOfButtion[694]=V694;
        ObjectsOfButtion[695]=V695;
        ObjectsOfButtion[696]=V696;
        ObjectsOfButtion[697]=V697;
        ObjectsOfButtion[698]=V698;
        ObjectsOfButtion[699]=V699;
        ObjectsOfButtion[700]=V700;
        ObjectsOfButtion[701]=V701;
        ObjectsOfButtion[702]=V702;
        ObjectsOfButtion[703]=V703;
        ObjectsOfButtion[704]=V704;
        ObjectsOfButtion[705]=V705;
        ObjectsOfButtion[706]=V706;
        ObjectsOfButtion[707]=V707;
        ObjectsOfButtion[708]=V708;
        ObjectsOfButtion[709]=V709;
        ObjectsOfButtion[710]=V710;
        ObjectsOfButtion[711]=V711;
        ObjectsOfButtion[712]=V712;
        ObjectsOfButtion[713]=V713;
        ObjectsOfButtion[714]=V714;
        ObjectsOfButtion[715]=V715;
        ObjectsOfButtion[716]=V716;
        ObjectsOfButtion[717]=V717;
        ObjectsOfButtion[718]=V718;
        ObjectsOfButtion[719]=V719;
        ObjectsOfButtion[720]=V720;
        ObjectsOfButtion[721]=V721;
        ObjectsOfButtion[722]=V722;
        ObjectsOfButtion[723]=V723;
        ObjectsOfButtion[724]=V724;
        ObjectsOfButtion[725]=V725;
        ObjectsOfButtion[726]=V726;
        ObjectsOfButtion[727]=V727;
        ObjectsOfButtion[728]=V728;
        ObjectsOfButtion[729]=V729;
        ObjectsOfButtion[730]=V730;
        ObjectsOfButtion[731]=V731;
        ObjectsOfButtion[732]=V732;
        ObjectsOfButtion[733]=V733;
        ObjectsOfButtion[734]=V734;
        ObjectsOfButtion[735]=V735;
        ObjectsOfButtion[736]=V736;
        ObjectsOfButtion[737]=V737;
        ObjectsOfButtion[738]=V738;
        ObjectsOfButtion[739]=V739;
        ObjectsOfButtion[740]=V740;
        ObjectsOfButtion[741]=V741;
        ObjectsOfButtion[742]=V742;
        ObjectsOfButtion[743]=V743;
        ObjectsOfButtion[744]=V744;
        ObjectsOfButtion[745]=V745;
        ObjectsOfButtion[746]=V746;
        ObjectsOfButtion[747]=V747;
        ObjectsOfButtion[748]=V748;
        ObjectsOfButtion[749]=V749;
        ObjectsOfButtion[750]=V750;
        ObjectsOfButtion[751]=V751;
        ObjectsOfButtion[752]=V752;
        ObjectsOfButtion[753]=V753;
        ObjectsOfButtion[754]=V754;
        ObjectsOfButtion[755]=V755;
        ObjectsOfButtion[756]=V756;
        ObjectsOfButtion[757]=V757;
        ObjectsOfButtion[758]=V758;
        ObjectsOfButtion[759]=V759;
        ObjectsOfButtion[760]=V760;
        ObjectsOfButtion[761]=V761;
        ObjectsOfButtion[762]=V762;
        ObjectsOfButtion[763]=V763;
        ObjectsOfButtion[764]=V764;
        ObjectsOfButtion[765]=V765;
        ObjectsOfButtion[766]=V766;
        ObjectsOfButtion[767]=V767;
        ObjectsOfButtion[768]=V768;
        ObjectsOfButtion[769]=V769;
        ObjectsOfButtion[770]=V770;
        ObjectsOfButtion[771]=V771;
        ObjectsOfButtion[772]=V772;
        ObjectsOfButtion[773]=V773;
        ObjectsOfButtion[774]=V774;
        ObjectsOfButtion[775]=V775;
        ObjectsOfButtion[776]=V776;
        ObjectsOfButtion[777]=V777;
        ObjectsOfButtion[778]=V778;
        ObjectsOfButtion[779]=V779;
        ObjectsOfButtion[780]=V780;
        ObjectsOfButtion[781]=V781;
        ObjectsOfButtion[782]=V782;
        ObjectsOfButtion[783]=V783;
        ObjectsOfButtion[784]=V784;
        ObjectsOfButtion[785]=V785;
        ObjectsOfButtion[786]=V786;
        ObjectsOfButtion[787]=V787;
        ObjectsOfButtion[788]=V788;
        ObjectsOfButtion[789]=V789;
        ObjectsOfButtion[790]=V790;
        ObjectsOfButtion[791]=V791;
        ObjectsOfButtion[792]=V792;
        ObjectsOfButtion[793]=V793;
        ObjectsOfButtion[794]=V794;
        ObjectsOfButtion[795]=V795;
        ObjectsOfButtion[796]=V796;
        ObjectsOfButtion[797]=V797;
        ObjectsOfButtion[798]=V798;
        ObjectsOfButtion[799]=V799;
        ObjectsOfButtion[800]=V800;
        ObjectsOfButtion[801]=V801;
        ObjectsOfButtion[802]=V802;
        ObjectsOfButtion[803]=V803;
        ObjectsOfButtion[804]=V804;
        ObjectsOfButtion[805]=V805;
        ObjectsOfButtion[806]=V806;
        ObjectsOfButtion[807]=V807;
        ObjectsOfButtion[808]=V808;
        ObjectsOfButtion[809]=V809;
        ObjectsOfButtion[810]=V810;
        ObjectsOfButtion[811]=V811;
        ObjectsOfButtion[812]=V812;
        ObjectsOfButtion[813]=V813;
        ObjectsOfButtion[814]=V814;
        ObjectsOfButtion[815]=V815;
        ObjectsOfButtion[816]=V816;
        ObjectsOfButtion[817]=V817;
        ObjectsOfButtion[818]=V818;
        ObjectsOfButtion[819]=V819;
        ObjectsOfButtion[820]=V820;
        ObjectsOfButtion[821]=V821;
        ObjectsOfButtion[822]=V822;
        ObjectsOfButtion[823]=V823;
        ObjectsOfButtion[824]=V824;
        ObjectsOfButtion[825]=V825;
        ObjectsOfButtion[826]=V826;
        ObjectsOfButtion[827]=V827;
        ObjectsOfButtion[828]=V828;
        ObjectsOfButtion[829]=V829;
        ObjectsOfButtion[830]=V830;
        ObjectsOfButtion[831]=V831;
        ObjectsOfButtion[832]=V832;
        ObjectsOfButtion[833]=V833;
        ObjectsOfButtion[834]=V834;
        ObjectsOfButtion[835]=V835;
        ObjectsOfButtion[836]=V836;
        ObjectsOfButtion[837]=V837;
        ObjectsOfButtion[838]=V838;
        ObjectsOfButtion[839]=V839;
        ObjectsOfButtion[840]=V840;
        ObjectsOfButtion[841]=V841;
        ObjectsOfButtion[842]=V842;
        ObjectsOfButtion[843]=V843;
        ObjectsOfButtion[844]=V844;
        ObjectsOfButtion[845]=V845;
        ObjectsOfButtion[846]=V846;
        ObjectsOfButtion[847]=V847;
        ObjectsOfButtion[848]=V848;
        ObjectsOfButtion[849]=V849;
        ObjectsOfButtion[850]=V850;
        ObjectsOfButtion[851]=V851;
        ObjectsOfButtion[852]=V852;
        ObjectsOfButtion[853]=V853;
        ObjectsOfButtion[854]=V854;
        ObjectsOfButtion[855]=V855;
        ObjectsOfButtion[856]=V856;
        ObjectsOfButtion[857]=V857;
        ObjectsOfButtion[858]=V858;
        ObjectsOfButtion[859]=V859;
        ObjectsOfButtion[860]=V860;
        ObjectsOfButtion[861]=V861;
        ObjectsOfButtion[862]=V862;
        ObjectsOfButtion[863]=V863;
        ObjectsOfButtion[864]=V864;
        ObjectsOfButtion[865]=V865;
        ObjectsOfButtion[866]=V866;
        ObjectsOfButtion[867]=V867;
        ObjectsOfButtion[868]=V868;
        ObjectsOfButtion[869]=V869;
        ObjectsOfButtion[870]=V870;
        ObjectsOfButtion[871]=V871;
        ObjectsOfButtion[872]=V872;
        ObjectsOfButtion[873]=V873;
        ObjectsOfButtion[874]=V874;
        ObjectsOfButtion[875]=V875;
        ObjectsOfButtion[876]=V876;
        ObjectsOfButtion[877]=V877;
        ObjectsOfButtion[878]=V878;
        ObjectsOfButtion[879]=V879;
        ObjectsOfButtion[880]=V880;
        ObjectsOfButtion[881]=V881;
        ObjectsOfButtion[882]=V882;
        ObjectsOfButtion[883]=V883;
        ObjectsOfButtion[884]=V884;
        ObjectsOfButtion[885]=V885;
        ObjectsOfButtion[886]=V886;
        ObjectsOfButtion[887]=V887;
        ObjectsOfButtion[888]=V888;
        ObjectsOfButtion[889]=V889;
        ObjectsOfButtion[890]=V890;
        ObjectsOfButtion[891]=V891;
        ObjectsOfButtion[892]=V892;
        ObjectsOfButtion[893]=V893;
        ObjectsOfButtion[894]=V894;
        ObjectsOfButtion[895]=V895;
        ObjectsOfButtion[896]=V896;
        ObjectsOfButtion[897]=V897;
        ObjectsOfButtion[898]=V898;
        ObjectsOfButtion[899]=V899;
        ObjectsOfButtion[900]=V900;
        ObjectsOfButtion[901]=V901;
        ObjectsOfButtion[902]=V902;
        ObjectsOfButtion[903]=V903;
        ObjectsOfButtion[904]=V904;
        ObjectsOfButtion[905]=V905;
        ObjectsOfButtion[906]=V906;
        ObjectsOfButtion[907]=V907;
        ObjectsOfButtion[908]=V908;
        ObjectsOfButtion[909]=V909;
        ObjectsOfButtion[910]=V910;
        ObjectsOfButtion[911]=V911;
        ObjectsOfButtion[912]=V912;
        ObjectsOfButtion[913]=V913;
        ObjectsOfButtion[914]=V914;
        ObjectsOfButtion[915]=V915;
        ObjectsOfButtion[916]=V916;
        ObjectsOfButtion[917]=V917;
        ObjectsOfButtion[918]=V918;
        ObjectsOfButtion[919]=V919;
        ObjectsOfButtion[920]=V920;
        ObjectsOfButtion[921]=V921;
        ObjectsOfButtion[922]=V922;
        ObjectsOfButtion[923]=V923;
        ObjectsOfButtion[924]=V924;
        ObjectsOfButtion[925]=V925;
        ObjectsOfButtion[926]=V926;
        ObjectsOfButtion[927]=V927;
        ObjectsOfButtion[928]=V928;
        ObjectsOfButtion[929]=V929;
        ObjectsOfButtion[930]=V930;
        ObjectsOfButtion[931]=V931;
        ObjectsOfButtion[932]=V932;
        ObjectsOfButtion[933]=V933;
        ObjectsOfButtion[934]=V934;
        ObjectsOfButtion[935]=V935;
        ObjectsOfButtion[936]=V936;
        ObjectsOfButtion[937]=V937;
        ObjectsOfButtion[938]=V938;
        ObjectsOfButtion[939]=V939;
        ObjectsOfButtion[940]=V940;
        ObjectsOfButtion[941]=V941;
        ObjectsOfButtion[942]=V942;
        ObjectsOfButtion[943]=V943;
        ObjectsOfButtion[944]=V944;
        ObjectsOfButtion[945]=V945;
        ObjectsOfButtion[946]=V946;
        ObjectsOfButtion[947]=V947;
        ObjectsOfButtion[948]=V948;
        ObjectsOfButtion[949]=V949;
        ObjectsOfButtion[950]=V950;
        ObjectsOfButtion[951]=V951;
        ObjectsOfButtion[952]=V952;
        ObjectsOfButtion[953]=V953;
        ObjectsOfButtion[954]=V954;
        ObjectsOfButtion[955]=V955;
        ObjectsOfButtion[956]=V956;
        ObjectsOfButtion[957]=V957;
        ObjectsOfButtion[958]=V958;
        ObjectsOfButtion[959]=V959;
        ObjectsOfButtion[960]=V960;
        ObjectsOfButtion[961]=V961;
        ObjectsOfButtion[962]=V962;
        ObjectsOfButtion[963]=V963;
        ObjectsOfButtion[964]=V964;
        ObjectsOfButtion[965]=V965;
        ObjectsOfButtion[966]=V966;
        ObjectsOfButtion[967]=V967;
        ObjectsOfButtion[968]=V968;
        ObjectsOfButtion[969]=V969;
        ObjectsOfButtion[970]=V970;
        ObjectsOfButtion[971]=V971;
        ObjectsOfButtion[972]=V972;
        ObjectsOfButtion[973]=V973;
        ObjectsOfButtion[974]=V974;
        ObjectsOfButtion[975]=V975;
        ObjectsOfButtion[976]=V976;
        ObjectsOfButtion[977]=V977;
        ObjectsOfButtion[978]=V978;
        ObjectsOfButtion[979]=V979;
        ObjectsOfButtion[980]=V980;
        ObjectsOfButtion[981]=V981;
        ObjectsOfButtion[982]=V982;
        ObjectsOfButtion[983]=V983;
        ObjectsOfButtion[984]=V984;
        ObjectsOfButtion[985]=V985;
        ObjectsOfButtion[986]=V986;
        ObjectsOfButtion[987]=V987;
        ObjectsOfButtion[988]=V988;
        ObjectsOfButtion[989]=V989;
        ObjectsOfButtion[990]=V990;
        ObjectsOfButtion[991]=V991;
        ObjectsOfButtion[992]=V992;
        ObjectsOfButtion[993]=V993;
        ObjectsOfButtion[994]=V994;
        ObjectsOfButtion[995]=V995;
        ObjectsOfButtion[996]=V996;
        ObjectsOfButtion[997]=V997;
        ObjectsOfButtion[998]=V998;
        ObjectsOfButtion[999]=V999;
        ObjectsOfButtion[1000]=V1000;
        ObjectsOfButtion[1001]=V1001;
        ObjectsOfButtion[1002]=V1002;
        ObjectsOfButtion[1003]=V1003;
        ObjectsOfButtion[1004]=V1004;
        ObjectsOfButtion[1005]=V1005;
        ObjectsOfButtion[1006]=V1006;
        ObjectsOfButtion[1007]=V1007;
        ObjectsOfButtion[1008]=V1008;
        ObjectsOfButtion[1009]=V1009;
        ObjectsOfButtion[1010]=V1010;
        ObjectsOfButtion[1011]=V1011;
        ObjectsOfButtion[1012]=V1012;
        ObjectsOfButtion[1013]=V1013;
        ObjectsOfButtion[1014]=V1014;
        ObjectsOfButtion[1015]=V1015;
        ObjectsOfButtion[1016]=V1016;
        ObjectsOfButtion[1017]=V1017;
        ObjectsOfButtion[1018]=V1018;
        ObjectsOfButtion[1019]=V1019;
        ObjectsOfButtion[1020]=V1020;
        ObjectsOfButtion[1021]=V1021;
        ObjectsOfButtion[1022]=V1022;
        ObjectsOfButtion[1023]=V1023;
        ObjectsOfButtion[1024]=V1024;
        ObjectsOfButtion[1025]=V1025;
        ObjectsOfButtion[1026]=V1026;
        ObjectsOfButtion[1027]=V1027;
        ObjectsOfButtion[1028]=V1028;
        ObjectsOfButtion[1029]=V1029;
        ObjectsOfButtion[1030]=V1030;
        ObjectsOfButtion[1031]=V1031;
        ObjectsOfButtion[1032]=V1032;
        ObjectsOfButtion[1033]=V1033;
        ObjectsOfButtion[1034]=V1034;
        ObjectsOfButtion[1035]=V1035;
        ObjectsOfButtion[1036]=V1036;
        ObjectsOfButtion[1037]=V1037;
        ObjectsOfButtion[1038]=V1038;
        ObjectsOfButtion[1039]=V1039;
        ObjectsOfButtion[1040]=V1040;
        ObjectsOfButtion[1041]=V1041;
        ObjectsOfButtion[1042]=V1042;
        ObjectsOfButtion[1043]=V1043;
        ObjectsOfButtion[1044]=V1044;
        ObjectsOfButtion[1045]=V1045;
        ObjectsOfButtion[1046]=V1046;
        ObjectsOfButtion[1047]=V1047;
        ObjectsOfButtion[1048]=V1048;
        ObjectsOfButtion[1049]=V1049;
        ObjectsOfButtion[1050]=V1050;
        ObjectsOfButtion[1051]=V1051;
        ObjectsOfButtion[1052]=V1052;
        ObjectsOfButtion[1053]=V1053;
        ObjectsOfButtion[1054]=V1054;
        ObjectsOfButtion[1055]=V1055;
        ObjectsOfButtion[1056]=V1056;
        ObjectsOfButtion[1057]=V1057;
        ObjectsOfButtion[1058]=V1058;
        ObjectsOfButtion[1059]=V1059;
        ObjectsOfButtion[1060]=V1060;
        ObjectsOfButtion[1061]=V1061;
        ObjectsOfButtion[1062]=V1062;
        ObjectsOfButtion[1063]=V1063;
        ObjectsOfButtion[1064]=V1064;
        ObjectsOfButtion[1065]=V1065;
        ObjectsOfButtion[1066]=V1066;
        ObjectsOfButtion[1067]=V1067;
        ObjectsOfButtion[1068]=V1068;
        ObjectsOfButtion[1069]=V1069;
        ObjectsOfButtion[1070]=V1070;
        ObjectsOfButtion[1071]=V1071;
        ObjectsOfButtion[1072]=V1072;
        ObjectsOfButtion[1073]=V1073;
        ObjectsOfButtion[1074]=V1074;
        ObjectsOfButtion[1075]=V1075;
        ObjectsOfButtion[1076]=V1076;
        ObjectsOfButtion[1077]=V1077;
        ObjectsOfButtion[1078]=V1078;
        ObjectsOfButtion[1079]=V1079;
        ObjectsOfButtion[1080]=V1080;
        ObjectsOfButtion[1081]=V1081;
        ObjectsOfButtion[1082]=V1082;
        ObjectsOfButtion[1083]=V1083;
        ObjectsOfButtion[1084]=V1084;
        ObjectsOfButtion[1085]=V1085;
        ObjectsOfButtion[1086]=V1086;
        ObjectsOfButtion[1087]=V1087;
        ObjectsOfButtion[1088]=V1088;
        ObjectsOfButtion[1089]=V1089;
        ObjectsOfButtion[1090]=V1090;
        ObjectsOfButtion[1091]=V1091;
        ObjectsOfButtion[1092]=V1092;
        ObjectsOfButtion[1093]=V1093;
        ObjectsOfButtion[1094]=V1094;
        ObjectsOfButtion[1095]=V1095;
        ObjectsOfButtion[1096]=V1096;
        ObjectsOfButtion[1097]=V1097;
        ObjectsOfButtion[1098]=V1098;
        ObjectsOfButtion[1099]=V1099;
        ObjectsOfButtion[1100]=V1100;
        ObjectsOfButtion[1101]=V1101;
        ObjectsOfButtion[1102]=V1102;
        ObjectsOfButtion[1103]=V1103;
        ObjectsOfButtion[1104]=V1104;
        ObjectsOfButtion[1105]=V1105;
        ObjectsOfButtion[1106]=V1106;
        ObjectsOfButtion[1107]=V1107;
        ObjectsOfButtion[1108]=V1108;
        ObjectsOfButtion[1109]=V1109;
        ObjectsOfButtion[1110]=V1110;
        ObjectsOfButtion[1111]=V1111;
        ObjectsOfButtion[1112]=V1112;
        ObjectsOfButtion[1113]=V1113;
        ObjectsOfButtion[1114]=V1114;
        ObjectsOfButtion[1115]=V1115;
        ObjectsOfButtion[1116]=V1116;
        ObjectsOfButtion[1117]=V1117;
        ObjectsOfButtion[1118]=V1118;
        ObjectsOfButtion[1119]=V1119;
        ObjectsOfButtion[1120]=V1120;
        ObjectsOfButtion[1121]=V1121;
        ObjectsOfButtion[1122]=V1122;
        ObjectsOfButtion[1123]=V1123;
        ObjectsOfButtion[1124]=V1124;
        ObjectsOfButtion[1125]=V1125;
        ObjectsOfButtion[1126]=V1126;
        ObjectsOfButtion[1127]=V1127;
        ObjectsOfButtion[1128]=V1128;
        ObjectsOfButtion[1129]=V1129;
        ObjectsOfButtion[1130]=V1130;
        ObjectsOfButtion[1131]=V1131;
        ObjectsOfButtion[1132]=V1132;
        ObjectsOfButtion[1133]=V1133;
        ObjectsOfButtion[1134]=V1134;
        ObjectsOfButtion[1135]=V1135;
        ObjectsOfButtion[1136]=V1136;
        ObjectsOfButtion[1137]=V1137;
        ObjectsOfButtion[1138]=V1138;
        ObjectsOfButtion[1139]=V1139;
        ObjectsOfButtion[1140]=V1140;
        ObjectsOfButtion[1141]=V1141;
        ObjectsOfButtion[1142]=V1142;
        ObjectsOfButtion[1143]=V1143;
        ObjectsOfButtion[1144]=V1144;
        ObjectsOfButtion[1145]=V1145;
        ObjectsOfButtion[1146]=V1146;
        ObjectsOfButtion[1147]=V1147;
        ObjectsOfButtion[1148]=V1148;
        ObjectsOfButtion[1149]=V1149;
        ObjectsOfButtion[1150]=V1150;
        ObjectsOfButtion[1151]=V1151;
        ObjectsOfButtion[1152]=V1152;
        ObjectsOfButtion[1153]=V1153;
        ObjectsOfButtion[1154]=V1154;
        ObjectsOfButtion[1155]=V1155;
        ObjectsOfButtion[1156]=V1156;
        ObjectsOfButtion[1157]=V1157;
        ObjectsOfButtion[1158]=V1158;
        ObjectsOfButtion[1159]=V1159;
        ObjectsOfButtion[1160]=V1160;
        ObjectsOfButtion[1161]=V1161;
        ObjectsOfButtion[1162]=V1162;
        ObjectsOfButtion[1163]=V1163;
        ObjectsOfButtion[1164]=V1164;
        ObjectsOfButtion[1165]=V1165;
        ObjectsOfButtion[1166]=V1166;
        ObjectsOfButtion[1167]=V1167;
        ObjectsOfButtion[1168]=V1168;
        ObjectsOfButtion[1169]=V1169;
        ObjectsOfButtion[1170]=V1170;
        ObjectsOfButtion[1171]=V1171;
        ObjectsOfButtion[1172]=V1172;
        ObjectsOfButtion[1173]=V1173;
        ObjectsOfButtion[1174]=V1174;
        ObjectsOfButtion[1175]=V1175;
        ObjectsOfButtion[1176]=V1176;
        ObjectsOfButtion[1177]=V1177;
        ObjectsOfButtion[1178]=V1178;
        ObjectsOfButtion[1179]=V1179;
        ObjectsOfButtion[1180]=V1180;
        ObjectsOfButtion[1181]=V1181;
        ObjectsOfButtion[1182]=V1182;
        ObjectsOfButtion[1183]=V1183;
        ObjectsOfButtion[1184]=V1184;
        ObjectsOfButtion[1185]=V1185;
        ObjectsOfButtion[1186]=V1186;
        ObjectsOfButtion[1187]=V1187;
        ObjectsOfButtion[1188]=V1188;
        ObjectsOfButtion[1189]=V1189;
        ObjectsOfButtion[1190]=V1190;
        ObjectsOfButtion[1191]=V1191;
        ObjectsOfButtion[1192]=V1192;
        ObjectsOfButtion[1193]=V1193;
        ObjectsOfButtion[1194]=V1194;
        ObjectsOfButtion[1195]=V1195;
        ObjectsOfButtion[1196]=V1196;
        ObjectsOfButtion[1197]=V1197;
        ObjectsOfButtion[1198]=V1198;
        ObjectsOfButtion[1199]=V1199;
        ObjectsOfButtion[1200]=V1200;
        ObjectsOfButtion[1201]=V1201;
        ObjectsOfButtion[1202]=V1202;
        ObjectsOfButtion[1203]=V1203;
        ObjectsOfButtion[1204]=V1204;
        ObjectsOfButtion[1205]=V1205;
        ObjectsOfButtion[1206]=V1206;
        ObjectsOfButtion[1207]=V1207;
        ObjectsOfButtion[1208]=V1208;
        ObjectsOfButtion[1209]=V1209;
        ObjectsOfButtion[1210]=V1210;
        ObjectsOfButtion[1211]=V1211;
        ObjectsOfButtion[1212]=V1212;
        ObjectsOfButtion[1213]=V1213;
        ObjectsOfButtion[1214]=V1214;
        ObjectsOfButtion[1215]=V1215;
        ObjectsOfButtion[1216]=V1216;
        ObjectsOfButtion[1217]=V1217;
        ObjectsOfButtion[1218]=V1218;
        ObjectsOfButtion[1219]=V1219;
        ObjectsOfButtion[1220]=V1220;
        ObjectsOfButtion[1221]=V1221;
        ObjectsOfButtion[1222]=V1222;
        ObjectsOfButtion[1223]=V1223;
        ObjectsOfButtion[1224]=V1224;
        ObjectsOfButtion[1225]=V1225;
        ObjectsOfButtion[1226]=V1226;
        ObjectsOfButtion[1227]=V1227;
        ObjectsOfButtion[1228]=V1228;
        ObjectsOfButtion[1229]=V1229;
        ObjectsOfButtion[1230]=V1230;
        ObjectsOfButtion[1231]=V1231;
        ObjectsOfButtion[1232]=V1232;
        ObjectsOfButtion[1233]=V1233;
        ObjectsOfButtion[1234]=V1234;
        ObjectsOfButtion[1235]=V1235;
        ObjectsOfButtion[1236]=V1236;
        ObjectsOfButtion[1237]=V1237;
        ObjectsOfButtion[1238]=V1238;
        ObjectsOfButtion[1239]=V1239;
        ObjectsOfButtion[1240]=V1240;
        ObjectsOfButtion[1241]=V1241;
        ObjectsOfButtion[1242]=V1242;
        ObjectsOfButtion[1243]=V1243;
        ObjectsOfButtion[1244]=V1244;
        ObjectsOfButtion[1245]=V1245;
        ObjectsOfButtion[1246]=V1246;
        ObjectsOfButtion[1247]=V1247;
        ObjectsOfButtion[1248]=V1248;
        ObjectsOfButtion[1249]=V1249;
        ObjectsOfButtion[1250]=V1250;
        ObjectsOfButtion[1251]=V1251;
        ObjectsOfButtion[1252]=V1252;
        ObjectsOfButtion[1253]=V1253;
        ObjectsOfButtion[1254]=V1254;
        ObjectsOfButtion[1255]=V1255;
        ObjectsOfButtion[1256]=V1256;
        ObjectsOfButtion[1257]=V1257;
        ObjectsOfButtion[1258]=V1258;
        ObjectsOfButtion[1259]=V1259;
        ObjectsOfButtion[1260]=V1260;
        ObjectsOfButtion[1261]=V1261;
        ObjectsOfButtion[1262]=V1262;
        ObjectsOfButtion[1263]=V1263;
        ObjectsOfButtion[1264]=V1264;
        ObjectsOfButtion[1265]=V1265;
        ObjectsOfButtion[1266]=V1266;
        ObjectsOfButtion[1267]=V1267;
        ObjectsOfButtion[1268]=V1268;
        ObjectsOfButtion[1269]=V1269;
        ObjectsOfButtion[1270]=V1270;
        ObjectsOfButtion[1271]=V1271;
        ObjectsOfButtion[1272]=V1272;
        ObjectsOfButtion[1273]=V1273;
        ObjectsOfButtion[1274]=V1274;
        ObjectsOfButtion[1275]=V1275;
    }
    public void make_pair(){

        for (int i = 1; i <1276 ; i++) {
            v.put(((Button)ObjectsOfButtion[i]).getId(),(Button) ObjectsOfButtion[i]);
            //System.out.println(v.get(((Button)ObjectsOfButtion[i]).getId()));
        }
    }
    void SetInitialpoint(int startpoint,int wallArray[],int endpoint, int shortestDist, int[] solutionPath ){
        this.Startpoint = startpoint;
        this.shortestDist=shortestDist;
        this.solutionPath=solutionPath;
        GreePathPoint=startpoint;
        this.Endpoint = endpoint;
        ((Button)(v.get("V"+Startpoint))).setStyle("-fx-border-radius:20%;-fx-background-radius: 20%; -fx-border-width: 1.5;");
        ((Button)(v.get("V"+Endpoint))).setStyle("-fx-border-radius:20%;-fx-background-radius: 20%; -fx-border-width: 1.5;");
        ((Button)(v.get("V"+Startpoint))).setStyle("-fx-background-color:#3ae374;-fx-border-color:#27ae60;");
        ((Button)(v.get("V"+Endpoint))).setStyle("-fx-background-color:#e74c3c;-fx-border-color:#ff6b6b;");

       for (int i = 0; i <WallArray.length ; i++) {

            ((Button)(v.get("V"+wallArray[i]))).setStyle("-fx-border-radius:20%;-fx-background-radius: 20%; -fx-border-width: 1.5;");
            ((Button)(v.get("V"+wallArray[i]))).setStyle("-fx-background-color:#636e72;-fx-border-color:#7f8c8d;");
        }
        System.out.println(shortestDist);
        System.out.println(Arrays.toString(solutionPath));


    }

    boolean isWall(int point){
        boolean yn=false;
        Arrays.sort(WallArray);
        for (int i = 0; i <WallArray.length ; i++) {
            if(WallArray[i]==point){
                yn=true;
                break;
            }
        }
        return yn;
    }
    void PlaysoundOnMOve(){
        String musicFile = "C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\zapsplat_multimedia_game_sound_classic_jump_007_41736.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    void PlayWinnerSound(){
        String musicFile = "C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\Winner.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    void PlaysoundAtWall(){
        String musicFile = "C:\\Users\\i\\Documents\\Maze\\pro1-20200104T053634Z-001\\pro1\\src\\sample\\wall.mp3";     // For example
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    public void KeyPressed(KeyEvent e) throws IOException, InterruptedException {
        int x = 0;
        if (winner == 0) {
            if (e.getCode() == KeyCode.UP && !isWall(GreePathPoint - 1)) {
                if (GreePathPoint > 0 && (GreePathPoint - 1) % 25 != 0) {
                    x = -1;
                    Score += 1;

                    System.out.println("UP");
                    PlaysoundOnMOve();
                }
            }
            if (e.getCode() == KeyCode.DOWN && !isWall(GreePathPoint + 1)) {
                if (GreePathPoint < 1276 && GreePathPoint % 25 != 0) {
                    x = 1;
                    Score += 1;
                    System.out.println("DOWN");
                    PlaysoundOnMOve();
                }
            }
            if (e.getCode() == KeyCode.LEFT && !isWall(GreePathPoint - 25)) {
                if (GreePathPoint > 0) {
                    x = -25;
                    Score += 1;
                    System.out.println("UP");
                    PlaysoundOnMOve();
                }
            }
            if (e.getCode() == KeyCode.RIGHT && !isWall(GreePathPoint + 25)) {
                if (GreePathPoint < 1276) {
                    x = 25;
                    Score += 1;
                    System.out.println("DOWN");
                    PlaysoundOnMOve();
                }

            }
            if (x == 0) {
                x = 0;
                PlaysoundAtWall();
                System.out.println("Wall");
            }
            if ((GreePathPoint + x) == Endpoint) {
                ((Button) (v.get("V" + (GreePathPoint + x)))).setStyle("-fx-border-radius:20%;-fx-background-radius: 20%; -fx-border-width: 2;");
                ((Button) (v.get("V" + (GreePathPoint + x)))).setStyle("-fx-background-color:#e74c3c;-fx-border-color:#3ae374;-fx-border-width: 1.5;");
                winner = 1;
                PlayWinnerSound();

                int paths[] = solutionPath;
                for (int i = paths.length-2; i > 0; i--) {
                    Button bb = v.get("V" + paths[i]);

                    System.out.print(bb.getId() + " ");
                    Timeline timeline = new Timeline(new KeyFrame(
                            Duration.millis(1500),
                            ae -> bb.setStyle("-fx-base: yellow;")));
                    timeline.play();
                    Thread.sleep(10);
                    //bb.setStyle("-fx-background-color:pink;-fx-opacity: 0.5;-fx-border-width: 0.5;-fx-border-color:black;-fx-border-radius:20%;-fx-background-radius:20%;");
                }

                /*FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ScoreScreen.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                ScoreScreenController scr=fxmlLoader.getController();
                scr.Score=(shortestDist*100/Score);
                scr.SetScore();
                Stage stage =new Stage();
                stage.setScene(new Scene(root,1300,700));
                stage.initStyle(StageStyle.UNDECORATED);
                stage.show();
                ((Node)(e.getSource())).getScene().getWindow().hide();*/

            } else {
                    ((Button) (v.get("V" + (GreePathPoint + x)))).setStyle("-fx-border-radius:20%;-fx-background-radius: 20%; -fx-border-width: 1.5;-fx-background-color:#3ae374;-fx-border-color:#e74c3c;");
                    //((Button) (v.get("V" + (GreePathPoint + x)))).setStyle("-fx-background-color:#3ae374;-fx-border-color:#e74c3c;-fx-border-width: 1.5;");
            }
            if (x != 0)
                ((Button) (v.get("V" + (GreePathPoint)))).setStyle("-fx-background-color:#3ae374;-fx-border-color:#27ae60;");
            GreePathPoint += x;
            ScoreLab.setText("Moves: " + Score);

        }
    }
    @FXML
    void GoBack(MouseEvent event) throws IOException, SQLException, ClassNotFoundException {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("Stage.fxml"));
        Parent root =(Parent)fxmlLoader.load();
        StageController st=fxmlLoader.getController();
        st.MakeStages();
        Stage stage =new Stage();
        stage.setScene(new Scene(root,1300,700));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void EndLevel(MouseEvent e) throws IOException {
        if(winner==1) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ScoreScreen.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            ScoreScreenController scr = fxmlLoader.getController();
            scr.Score = (shortestDist * 100 / Score);
            scr.SetScore();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 1300, 700));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node) (e.getSource())).getScene().getWindow().hide();
        }
    }
}
